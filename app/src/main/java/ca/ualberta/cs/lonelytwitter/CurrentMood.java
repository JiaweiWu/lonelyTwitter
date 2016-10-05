package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Class <code>CurrentMood</code> represents the current "mood" of the user
 *
 * @author: Jiawei
 * @version: 1.0
 * @see LonelyTwitterActivity
 */
public abstract class CurrentMood {

    private Date date;

    /**
     * constructor for the <code>CurrentMood</code> class
     *
     * @param date Date when an instance of this class is created
     */
    public CurrentMood(Date date) {
        this.date = date;
    }

    /**
     * Setter for date property
     *
     * @param date Date when an instance of this class is created
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Getter for date property
     *
     * @return date returns the date property
     */
    public Date getDate() {
        return date;
    }

    /**
     * Gets mood.
     *
     * @return the mood
     */
    public abstract String getMood();
}
