import java.util.ArrayList;
/**
 * Write a description of class Media here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medium
{
    protected String title;
    protected String artist;
    protected String recordLabel;
    protected String yearReleased;
    protected String tapeType;
    protected InputReader reader;
    protected long archiveNumber;
    protected long CDNumber = 10000;
    protected long vinylNumber = 20000;
    protected long tapeNumber = 30000;
    protected long hdNumber = 1;
    private ArrayList<Medium> CDCollection;
    private ArrayList<Medium> TapeCollection;
    private ArrayList<Medium> VinylCollection;
//     private long CDNumber;

    protected AudioTracks audioTracks;
    private Medium medium;
    protected String input;
    protected int result;
    protected boolean wantToQuit = false;

    protected CD cd;
    protected Tape tape;

                
    /**
     * Constructor for objects of class Media
     */
    public Medium()
    {
        this.title = title;
        reader = new InputReader();
        CDCollection = new ArrayList<Medium>();
        TapeCollection = new ArrayList<Medium>();
        VinylCollection = new ArrayList<Medium>();
        audioTracks = new AudioTracks();

    }

    public String getTitle(){
        return title;
    }

    public long getArchiveNumber(){
        return archiveNumber;
    }

    public long getCDNumber(){
        long newCDNumber = CDNumber + CDCollection.size();
        return newCDNumber;
    }
    
    public long getVinylNumber(){
        long newVinylNumber = vinylNumber + VinylCollection.size();
        return newVinylNumber;
    }
    
    public long getTapeNumber(){
        long newTapeNumber = tapeNumber + TapeCollection.size();
        return newTapeNumber;
    }
    
    public void setTitle(String title){
        this.title = title;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public void setRecordLabel(String recordLabel){
        this.recordLabel = recordLabel;
    }

    public void setYearReleased(String yearReleased){
        this.yearReleased = yearReleased;
    }

    public void setArchiveNumber(long archiveNumber){
        this.archiveNumber = archiveNumber;
    }

    public void setTapeType(String tapeType){
        this.tapeType = tapeType;
    }

    /**
     * Entering section for adding Tapes to the mediumCollection ArrayList
     **/

    /**
     * 
     */

    public void setNewTapeMedia(String title, String artist, String tapeType, 
    long archiveNumber){
        this.archiveNumber = tapeNumber++;
        if (tapeNumber<39999 && tapeNumber>30000)
        {            
            TapeCollection.add(new Tape(title, artist, tapeType, archiveNumber));
        }
        else        
        {
            System.out.println("Store between 30000 and 40000");
            System.out.println("this was a fail");
        }
    }

    /**
     * 
     */

    public void addNewTape()
    {
        String title = "Unknown"; 
        String artist = "Unknown";
        String tapeType = "Unknown";
        long archiveNumber = getTapeNumber();

        System.out.println("Set the name of the Tape: ");
        title = reader.getInput();  
        System.out.println(" Set the name of artist, reporter etc.: ");
        artist = reader.getInput(); 
        System.out.println("Type of tape (Digital or Analog):");
        tapeType = reader.getInput(); 

        Tape tempMedia = this.setNewTape(title, artist, tapeType, archiveNumber);
        Tape tempTapeMedia = (Tape) tempMedia;
    }

    private Tape setNewTape(String title, String artist, String tapeType, 
    long archiveNumber)
    {  
        setNewTapeMedia(title, artist, tapeType, archiveNumber);
        Tape tempTape = new Tape(title, artist, tapeType, archiveNumber);
        tempTape.setTitle(title);
        tempTape.setArtist(artist);
        tempTape.setRecordLabel(tapeType);
        tempTape.setArchiveNumber(archiveNumber);
        return tempTape;
    }

    /**
     * Entering section for adding Vinyls to the mediumCollection ArrayList
     **/

    /**
     * 
     */

    public void setNewVinylMedia(String title, String artist, String recordLabel, String yearReleased, 
    long archiveNumber){
        this.archiveNumber = vinylNumber++;
        if (vinylNumber<29999 && vinylNumber>20000)
        {            
            VinylCollection.add(new Vinyl(title, artist, recordLabel, yearReleased, archiveNumber));
        }
        else        
        {
            System.out.println("Store between 20000 and 30000");
            System.out.println("this was a fail");
        }
    }

    /**
     * 
     */
    public void addNewVinyl()
    {
        String title = "Unknown"; 
        String artist = "Unknown";
        String recordLabel = "Unknown";
        String yearReleased = "Unknown";
        long archiveNumber = getVinylNumber();

        System.out.println("Set the name of the vinyl: ");
        title = reader.getInput();  
        System.out.println(" Set the name of artist: ");
        artist = reader.getInput(); 
        System.out.println("Record label (EMI, Polygram, Sony, Warner Music Group etc):");
        recordLabel = reader.getInput(); 
        System.out.println("Set the year Released: ");
        yearReleased = reader.getInput();

        Medium tempMedia = this.setNewVinyl(title, artist, recordLabel, yearReleased, archiveNumber);
        Vinyl tempCDMedia = (Vinyl) tempMedia;
    }

    private Vinyl setNewVinyl(String title, String artist, String recordLabel, String yearReleased,
    long archiveNumber)
    {  
        setNewVinylMedia(title, artist, recordLabel, yearReleased, archiveNumber);
        Vinyl tempVinyl = new Vinyl(title, artist, recordLabel, yearReleased, archiveNumber);
        tempVinyl.setTitle(title);
        tempVinyl.setArtist(artist);
        tempVinyl.setRecordLabel(recordLabel);
        tempVinyl.setYearReleased(yearReleased);
        tempVinyl.setArchiveNumber(archiveNumber);
        return tempVinyl;
    }

    /**
     * Entering section for adding CDs to the mediumCollection ArrayList
     **/

    /**
     * 
     */

    public void setNewCDMedia(String title, String artist, String recordLabel, String yearReleased, 
    long archiveNumber){
        this.archiveNumber = archiveNumber++;
        if (archiveNumber<19999 && archiveNumber>10000)
        {       
            CDCollection.add(new CD(title, artist, recordLabel, yearReleased, archiveNumber));
        }
        else if (archiveNumber>19999 || archiveNumber<10000)
        {
            System.out.println("Store between 10000 and 20000");
        }
    }

    public void addNewCD()
    {
        String title = "Unknown"; 
        String artist = "Unknown";
        String recordLabel = "Unknown";
        String yearReleased = "Unknown";
        long archiveNumber = getCDNumber();

        System.out.println("Set the name of the album: ");
        title = reader.getInput();  
        System.out.println(" Set the name of artist (if the CD is a collection of various artists, use'Various Artists' as name): ");
        artist = reader.getInput(); 
        System.out.println("Record label (EMI, Polygram, Sony, Warner Music Group etc):");
        recordLabel = reader.getInput(); 
        System.out.println("Set the year Released: ");
        yearReleased = reader.getInput();


        Medium tempMedia = this.setNewCD(title, artist, recordLabel, yearReleased, archiveNumber );
        CD tempCDMedia = (CD) tempMedia;
    }

    private CD setNewCD(String title, String artist, String recordLabel, String yearReleased,
    long archiveNumber )
    {  
        setNewCDMedia(title, artist, recordLabel, yearReleased, archiveNumber);
        CD tempCD = new CD(title, artist, recordLabel, yearReleased, archiveNumber);
        tempCD.setTitle(title);
        tempCD.setArtist(artist);
        tempCD.setRecordLabel(recordLabel);
        tempCD.setYearReleased(yearReleased);
        tempCD.setArchiveNumber(archiveNumber);
        return tempCD;
    }     

    public void addTracksToCD(){

    }
}

