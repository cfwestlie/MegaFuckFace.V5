import java.util.GregorianCalendar;
import java.time.Duration;
/**
 * Write a description of class News here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class News extends AudioTracks

{
    private String journalist;
    private String story;
    private String dateProduced;
    private String dateBroadcast;

    /**
     * Constructor for objects of class News
     */
    public News(String title, long minutes, long seconds, String journalist, String story)
    {
//         super(title, minutes, seconds, medium);
        this.story = story;
        this.journalist = journalist;
        this.dateProduced = dateProduced;
        this.dateBroadcast = dateBroadcast;
    }
    
    public String getJournalist(){
        return journalist;
    }
    
    public String getStory(){
        return story;
    }
    
//     public String getDate(){
//         return date;
//     }

    
    


}
