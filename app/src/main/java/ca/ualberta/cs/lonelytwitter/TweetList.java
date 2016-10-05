package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Maintains a list of tweets!
 *
 * @author Jiawei
 */
public class TweetList {
    private List<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * Add.
     *
     * @param tweet the tweet
     */
    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    /**
     * Has tweet boolean.
     *
     * @param tweet the tweet
     * @return the boolean
     */
    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    /**
     * Gets tweet.
     *
     * @param i the
     * @return the tweet
     */
    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    /**
     * Remove.
     *
     * @param tweet the tweet
     */
    public void remove(Tweet tweet) {
        tweets.remove(tweet);
    }
}