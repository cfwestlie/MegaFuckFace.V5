import java.util.ArrayList;
import java.time.Duration;

/**
 * Write a description of class audioTracks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AudioTracks
{
    protected long date;
    protected long minutes;
    protected long seconds;
    protected String title;
    private String yearReleased;
    private String company;
    private String product;
    private String description;
    private String journalist;
    private String story;
    private String artist;
    private String lastPlayed;
    
    
    private Duration duration;
    private Medium mediumContaining;
    private ArrayList<AudioTracks> newsCollection;
    private ArrayList<AudioTracks> musicCollection;
    private ArrayList<AudioTracks> jingleCollection;
    private ArrayList<AudioTracks> effectsCollection;
    
    private InputReader reader;
    
    
    /**
     * Constructor for objects of class audioTracks
     */
    public AudioTracks()
    {
        this.title = title;
        this.duration = Duration.ofSeconds(seconds).plusMinutes(minutes); ;
        reader = new InputReader();
        newsCollection = new ArrayList<AudioTracks>();
        musicCollection = new ArrayList<AudioTracks>();
        jingleCollection = new ArrayList<AudioTracks>();
        effectsCollection = new ArrayList<AudioTracks>();
    }
    
    public String getTitle(){
        return title;
    }
   
    
    public void addNews(News news){
        newsCollection.add(news);
        }
    
    public void addEffects(Effects effects){
        effectsCollection.add(effects);   
    }
    
    public void addMusic(Music music){
        musicCollection.add(music);
    }
    
    public void addMusic(Jingle jingle){
        jingleCollection.add(jingle);
    }
    
    public void setDuration(long minutes, long seconds){
        this.duration = Duration.ofSeconds(seconds).plusMinutes(minutes);   
    }
    
    public void setDuration (Duration duration){
        this.duration = duration;
    }
    
    public Duration getDuration(){
        return this.duration;
    }
    
    public String getDurationAsString(){
        long s = this.duration.getSeconds();
        return String.format("%02d:%02d:%02d", s/3600,(s%3600)/60, (s%60));
    }
        
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setMinutes(long minutes){
        this.minutes = minutes;
    }
    
    public void setSeconds(long seconds){
        this.seconds = seconds;
    }
    
    public void setProduct(String product){
        this.product = product;
    }
    
    public void setCompany(String company){
        this.company = company;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setJournalist(String journalist){
        this.journalist = journalist;
    }
    
    public void setStory(String story){
        this.story = story;
    }
    
        
    public void setArtist(String artist){
        this.artist = artist;
    }
        
    public void setTimesPlayed(int timesPlayed){
        this.artist = artist;
    }
    
    public void setLastPlayed(String lastPlayed){
        this.lastPlayed = lastPlayed;
    }
    /**
     * Jingle section
     */
    
    /**
     * 
     */
    public void setNewAudioJingle(String title, long minutes, long seconds, String product, String company){
        if(title != null){
            jingleCollection.add(new Jingle(title, minutes, seconds, product, company));
        }
        else{
            System.out.println("something went wrong");
        }
        
    }
    
    /**
     * 
     */
    public void addNewJingle()
    {
        String title = "Unknown"; 
        long minutes = 0;
        long seconds = 0;
        String product = "Unknown";
        String company = "Unknown";
      

        System.out.println("Set the name of the jingle: ");
        title = reader.getInput();  
        
        System.out.println("set the company which pays for the advertising: ");
        company = reader.getInput();
        
        System.out.println("set the name of the product: ");
        product = reader.getInput();
        
        System.out.println(" Set the duration of minutes: ");
        minutes = reader.getInputLong(); 
        
        System.out.println("set the duration of seconds: ");
        seconds = reader.getInputLong(); 
        
        AudioTracks tempTrack = this.setNewJingle(title, minutes, seconds, product, company);
        Jingle tempJingleTrack = (Jingle) tempTrack;
    }
    
    private Jingle setNewJingle(String title, long minutes, long seconds, String product, String company)
    {  
          setNewAudioJingle(title, minutes, seconds, product, company);
          Jingle tempJingle = new Jingle(title, minutes, seconds, product, company);
          tempJingle.setTitle(title);
          tempJingle.setMinutes(minutes);
          tempJingle.setSeconds(seconds);
          tempJingle.setProduct(product);
          tempJingle.setCompany(company);
          return tempJingle;
    }
    
    /**
     * Effects section
     */

    /**
     * 
     */
    public void setNewAudioEffects(String title, String description, long minutes, long seconds){
        if(title != null){
            jingleCollection.add(new Effects(title, description, minutes, seconds));
        }
        else{
            System.out.println("something went wrong");
        }
        
    }
    
    public void addNewEffects()
    {
        String title = "Unknown"; 
        String description = "Unknown";
        long minutes = 0;
        long seconds = 0;
        
      

        System.out.println("Set the name of the effect: ");
        title = reader.getInput();  
        
        System.out.println("describe the effect, eg applause: ");
        description = reader.getInput();
        
        System.out.println(" Set the duration of minutes: ");
        minutes = reader.getInputLong(); 
        
        System.out.println("set the duration of seconds: ");
        seconds = reader.getInputLong(); 
        
        AudioTracks tempTrack = this.setNewEffects(title, description, minutes, seconds);
        Effects tempEffectsTrack = (Effects) tempTrack;
    }
    
    private Effects setNewEffects(String title, String description, long minutes, long seconds)
    {  
          setNewAudioEffects(title, description, minutes, seconds);
          Effects tempEffects = new Effects(title, description, minutes, seconds);
          tempEffects.setTitle(title);
          tempEffects.setDescription(description);
          tempEffects.setMinutes(minutes);
          tempEffects.setSeconds(seconds);
          return tempEffects;
    }  
    
    /**
     * News Section
     */
    
    /**
     * 
     */
        public void setNewAudioNews(String title, long minutes, long seconds, String journalist,
                                    String story){
        if(title != null){
            newsCollection.add(new News(title, minutes, seconds, journalist, story));
        }
        else{
            System.out.println("something went wrong");
        }
        
    }
    
    /**
     * 
     */
    public void addNewNews()
    {
        String title = "Unknown"; 
        long minutes = 0;
        long seconds = 0;
        String journalist = "Unknown";
        String story = "Unknown";
      

        System.out.println("Set the name of the News: ");
        title = reader.getInput();  
        
        System.out.println("write a news story: ");
        story = reader.getInput();
        
        System.out.println("journalist's name: ");
        journalist = reader.getInput();
        
        System.out.println(" Set the duration of minutes: ");
        minutes = reader.getInputLong(); 
        
        System.out.println("set the duration of seconds: ");
        seconds = reader.getInputLong(); 
        
        AudioTracks tempTrack = this.setNewNews(title, minutes, seconds, journalist, story);
        News tempNewsTrack = (News) tempTrack;
    }
    
    private News setNewNews(String title, long minutes, long seconds, String journalist, String story)
    {  
          setNewAudioNews(title, minutes, seconds, journalist, story);
          News tempNews = new News(title, minutes, seconds, journalist, story);
          tempNews.setTitle(title);
          tempNews.setMinutes(minutes);
          tempNews.setSeconds(seconds);
          tempNews.setJournalist(journalist);
          tempNews.setStory(story);
          tempNews.setDuration(minutes, seconds);
          return tempNews;
    }
    
     /**
     * Music Section
     */
    
    /**
     * 
     */
        public void setNewAudioMusic(String artist,String title, long minutes, long seconds, 
        int timesPlayed, String lastPlayed){
        if(title != null){
            musicCollection.add(new Music(artist, title, minutes, seconds, timesPlayed, lastPlayed));
        }
        else{
            System.out.println("something went wrong");
        }
        
    }
    
    /**
     * 
     */
    public void addNewMusic()
    {
        String artist = "Unknown"; 
        String title = "Unknown"; 
        long minutes = 0;
        long seconds = 0;
        int timesPlayed = 0;
        String lastPlayed = "Unknown";
      

        
        System.out.println("Set the name of the News: ");
        artist = reader.getInput(); 
        
        System.out.println("Set the name of the News: ");
        title = reader.getInput();  
        
        System.out.println("write a news story: ");
        lastPlayed = reader.getInput();
        
        System.out.println("journalist's name: ");
        timesPlayed = reader.getInputInt();
        
        System.out.println(" Set the duration of minutes: ");
        minutes = reader.getInputLong(); 
        
        System.out.println("set the duration of seconds: ");
        seconds = reader.getInputLong(); 
        
        AudioTracks tempTrack = this.setNewMusic(artist, title, minutes, seconds, timesPlayed, lastPlayed);
        Music tempMusicTrack = (Music) tempTrack;
    }
    
    private Music setNewMusic(String artist,String title, long minutes, long seconds, 
        int timesPlayed, String lastPlayed)
    {  
          setNewAudioMusic(artist, title, minutes, seconds, timesPlayed, lastPlayed);
          Music tempMusic = new Music(artist, title, minutes, seconds, timesPlayed, lastPlayed);
          tempMusic.setArtist(artist);
          tempMusic.setTitle(title);
          tempMusic.setMinutes(minutes);
          tempMusic.setSeconds(seconds);
          tempMusic.setTimesPlayed(timesPlayed);
          tempMusic.setLastPlayed(lastPlayed);
//           tempNews.setDuration(minutes, seconds);
          return tempMusic;
    }
    

    

    
    
//     public static void main(String[] args){
//         AudioTracks st = new AudioTracks(title, duration, medium);
//         
//         st.setDuration(125, 34);
//         System.out.println("Duration (hh:mm:ss): " + st.getDurationAsString());
//     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
