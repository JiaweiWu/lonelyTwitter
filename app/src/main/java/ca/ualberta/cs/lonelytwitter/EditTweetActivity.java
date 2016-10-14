package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    private TextView textview;
    private Tweet tweet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        textview = (TextView) findViewById(R.id.textView);
        tweet = (Tweet) getIntent().getSerializableExtra("HELLO");
        textview.setText(tweet.getMessage());
    }
}
