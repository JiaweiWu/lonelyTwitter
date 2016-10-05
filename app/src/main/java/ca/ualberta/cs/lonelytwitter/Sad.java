package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Class represent Sad mood
 *
 * @author Jiawei
 * @see CurrentMood
 */
public class Sad extends CurrentMood {

    /**
     * Instantiates a new Sad.
     *
     * @param date the date
     */
    public Sad(Date date) {

        super(date);
    }

    /**
     * Instantiates a new Sad.
     *
     * @return Returns message
     */
    public String getMood() {
        return "Current Mood is Sad!";
    }
}
