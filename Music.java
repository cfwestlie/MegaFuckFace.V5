import java.time.Duration;

/**
 * Write a description of class Music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music extends AudioTracks
{
    private String artist;
    private String lastPlayed;
    private int timesPlayed = 0;
    
    
    /**
     * Constructor for objects of class Music
     */
    public Music(String artist, String title, long minutes, long seconds, int timesPlayed, String lastPlayed)
    {
//         super(title, minutes, seconds, medium);
        this.artist = artist;
        this.lastPlayed = lastPlayed;
        this.timesPlayed = timesPlayed;
        
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String getLastPlayed(){
        return lastPlayed;
    }
    
    public int getTimesPlayed(){
        //funksjon når den spilles, adds one..
        
        return timesPlayed;
    }

}
