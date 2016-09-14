package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jwu5 on 9/13/16.
 */
public class Sad extends CurrentMood {

    public Sad(Date date) {

        super(date);
    }

    public String getMood() {
        return "Current Mood is Sad!";
    }
}
