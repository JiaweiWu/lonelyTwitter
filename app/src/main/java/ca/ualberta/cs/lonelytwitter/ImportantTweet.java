package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jwu5 on 9/13/16.
 */
public class ImportantTweet extends Tweet {

    public ImportantTweet(String message) {
        super(message);
    }

    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
