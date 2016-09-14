package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jwu5 on 9/13/16.
 */
public abstract class CurrentMood {

    private Date date;

    public CurrentMood(Date date) {
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public abstract String getMood();
}
