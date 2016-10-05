package ca.ualberta.cs.lonelytwitter;

/**
 * Normal tweet class
 *
 * @author Jiawei
 */
public class NormalTweet extends Tweet implements Tweetable {
    /**
     * This constructor makes a normal tweet instance given a string
     *
     * @param message string that includes the tweet
     */
    public NormalTweet(String message){
        super(message);
    }

    /**
     * Checks to see if the current tweet is important (which it is not)@author Jiawei
     * @return returns false
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
