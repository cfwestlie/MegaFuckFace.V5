import java.util.ArrayList;
/**
 * Write a description of class Vinyl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vinyl extends Medium
{
    private String yearReleased;
    private String recordLabel;
    private String title;
    private String artist;
    private ArrayList<AudioTracks> vinylTracks;

    /**
     * Constructor for objects of class Vinyl
     */
    public Vinyl(String title, String artist, String recordLabel, String yearReleased,
                        long archiveNumber)
    {
        this.recordLabel = recordLabel;
        this.yearReleased = yearReleased;
        this.title = title;
        this.artist = artist;
        this.archiveNumber = archiveNumber;
          vinylTracks = new ArrayList<AudioTracks>();

    }
        
        public void addToVinyl(AudioTracks audioTracks){
        
        vinylTracks.add(audioTracks);
       
        
        
    }

}
