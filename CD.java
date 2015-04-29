import java.util.ArrayList;
/**
 * Write a description of class CD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CD extends Medium
{
    private String yearReleased;
    private String recordLabel;
    private String title;
    private String artist;
    //     private int totalDuration;

    private ArrayList<AudioTracks> CDTracks;

    /**
     * Constructor for objects of class CD
     */
    public CD(String title, String artist, String recordLabel, String yearReleased,
                        long archiveNumber)
    {
        this.recordLabel = recordLabel;
        this.yearReleased = yearReleased;
        this.title = title;
        this.artist = artist;
        this.archiveNumber = archiveNumber;
        CDTracks = new ArrayList<AudioTracks>();


    }
    
//         public void setTitle(String title){
//         this.title = title;
//     }
//     
//       public void setArtist(String artist){
//         this.artist = artist;
//     }
        
        public void addToCD(AudioTracks audioTracks){
        
        CDTracks.add(audioTracks);

    }
    
    public String getYearReleased(){
        return yearReleased;
    }
    
    public String getRecordLabel(){
        return recordLabel;
    }
    
    public String getArtist(){
        return artist;
    }
    
//     public void addJingleToCd2(Jingle jingle){
//         cdTracks.add(jingle);
//     }
    

    
    
    
    
    
    
    
        
        
}
