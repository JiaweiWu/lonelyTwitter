package ca.ualberta.cs.lonelytwitter;

import android.os.AsyncTask;
import android.util.Log;

import com.searchly.jestdroid.DroidClientConfig;
import com.searchly.jestdroid.JestClientFactory;
import com.searchly.jestdroid.JestDroidClient;

import org.w3c.dom.Document;

import java.util.ArrayList;
import java.util.List;

import io.searchbox.core.DocumentResult;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;

/**
 * Created by Jiawei on 10/18/2016.
 */
public class ElasticsearchTweetController {
    private static JestDroidClient client;

    //TODO we need a function that gets tweets
    public static class GetTweetTask extends AsyncTask<String, Void, ArrayList<NormalTweet>> {

        @Override
        protected ArrayList<NormalTweet> doInBackground(String... search_paramteters) {
            verifySettings();

            ArrayList<NormalTweet> tweets = new ArrayList<NormalTweet>();

            //Assume that search_parameters[0] is the onyl search term we are interested in using
            Search search = new Search.Builder(search_paramteters[0]).addIndex("testing").addType("tweet").build();
            try {
                SearchResult result = client.execute(search);
                if (result.isSucceeded()) {
                    List<NormalTweet> foundTweets = result.getSourceAsObjectList(NormalTweet.class);
                    tweets.addAll(foundTweets);
                }
                else {
                    Log.i("Error", "Search query to failed to find any tweets that matched");
                }
            }
            catch (Exception e) {
                Log.i("Error", "communcations with elasticsearch server failed");
            }
            return null;
    }
    //TODO we need a fucntiion that adds a tweet
    public static class AddTweetTask extends AsyncTask<NormalTweet, Void, Void> {

        @Override
        protected Void doInBackground(NormalTweet... tweets) {
            verifySettings();

            for (NormalTweet tweet: tweets) {
                Index index = new Index.Builder(tweet).index("testing").type("tweet").build();

                try {
                    DocumentResult result = client.execute(index);
                    if(result.isSucceeded()) {
                        tweet.setId(result.getId());
                    }
                    else {
                        Log.i("Error", "Elastic search was not able to add the tweet");
                    }
                }
                catch (Exception e) {
                    Log.i("uhoh", "We failed to add a tweet");
                    e.printStackTrace();
                }
            }
            return null;
        }
    }
    private static void verifySettings() {
        // if the client hasn't been initialized then we should make it
        if (client == null) {
            DroidClientConfig.Builder builder = new DroidClientConfig.Builder("http://cmput301.softwareprocess.es:8080/");
            DroidClientConfig config = builder.build();

            JestClientFactory factory  = new JestClientFactory();
            factory.setDroidClientConfig(config);
            client = (JestDroidClient) factory.getObject();
        }
    }
    }
}
