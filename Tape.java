import java.util.ArrayList;
/**
 * Write a description of class Tape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tape extends Medium
{
    private String tapeType;
    private ArrayList<AudioTracks> tapeTracks;
    private Medium medium;

    /**
     * Constructor for objects of class Tape
     */
    public Tape(String title, String artist, String tapeType, long archiveNumber)
    {
        this.title = title;
        this.artist = artist;
        this.tapeType = tapeType;
        this.archiveNumber = tapeNumber;
        tapeTracks = new ArrayList<AudioTracks>();
    }
    
        public void addToTape(AudioTracks audioTracks){
        
        tapeTracks.add(audioTracks);
       
        
        
    }
 
}
