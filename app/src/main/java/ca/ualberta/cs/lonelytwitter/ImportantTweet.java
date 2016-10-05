package ca.ualberta.cs.lonelytwitter;

/**
 * Important tweet class
 *
 * @author Jiawei
 */
public class ImportantTweet extends Tweet {

    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Overrides parent method, indicates the tweet is important
     *
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
