import java.time.Duration;
/**
 * Write a description of class Effects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Effects extends AudioTracks
{
    private String description;

    /**
     * Constructor for objects of class Effects
     */
    public Effects(String title, String description, long minutes, long seconds)
    {
       this.title = title;
       this.description = description;
       this.minutes = minutes;
       this.seconds = seconds;
       
    }
    
    public String getDescription(){
        return description;
    }
    
    


}
