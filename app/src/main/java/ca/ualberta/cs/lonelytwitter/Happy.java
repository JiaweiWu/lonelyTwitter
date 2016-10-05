package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Class represent Sad mood
 *
 * @author Jiawei
 * @see CurrentMood
 */
public class Happy extends CurrentMood {

    /**
     * Instantiates a new Happy.
     *
     * @param date the date
     */
    public Happy(Date date) {

        super(date);
    }

    public String getMood() {
        return "Current Mood is Happy!";
    }
}
