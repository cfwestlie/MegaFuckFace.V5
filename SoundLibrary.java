import java.util.ArrayList;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


/**
 * Write a description of class SoundLibrary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoundLibrary
{
    //private ArrayList<Medium> libraryCollection;
    private String input;
    private int result;
    private boolean wantToQuit = false;
    private InputReader reader;
//     private CD cd;
    private Medium medium;
    private String title;
    private String artist;
    private AudioTracks audioTracks;
    
    private long archiveNumber;
    private long CDNumber = 10001;
    private long vinylNumber = 20001;
    private long tapeNumber = 30001;
    private long hdNumber = 1;
    
    //     private long archiveNumber;
    //     private long CDNumber = 10001;
    //     private long vinylNumber = 20001;
    //     private long tapeNumber = 30001;
    //     private long hdNumber = 1;

    /**
     * Constructor for objects of class SoundLibrary
     */
    public SoundLibrary()
    {
//         libraryCollection = new ArrayList<Medium>();
        reader = new InputReader();
        //cd = new CD(title, artist, recordLabel, yearReleased);
        medium = new Medium();
        
        audioTracks = new AudioTracks();
        //this.archiveNumber = archiveNumber;
    }

//     public void addMedium(Medium medium){
//         libraryCollection.add(medium);
// 
//     }
    
    public void MediaLibrary() 
    {            
       printMainMenu();
        //                 
     
       boolean finished = false;
       while(! finished){
           finished = mainMenu();
       }
        System.out.println("Thank you for playing.  Good bye.");
    }

    private void printMainMenu(){
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("Welcome to Gloppen nærradio media archive!");
        System.out.println();
        System.out.println("- Main Menu -");
        System.out.println("1. Add new Medium");
        System.out.println("2. Add new Audiotrack");
        System.out.println("3. Search");
        System.out.println("6. Exit");
        System.out.println();
        System.out.println("**********************************************************");
        mainMenu();
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @return true If the command ends the game, false otherwise.
     * @param command The command to be processed.
     */

    private boolean mainMenu() 
    {
        
        String answer = reader.getInput();
        
        switch (answer) {
            //             default:
            //                 answer = Integer.parseInt(scanner.next());
            case "1":
            //             printMediumMenu();
            MediumLibrary();
            
            break;

            case "2":
            TrackLibrary();
            break;

            case "3":
            //                 goRoom(command);
            break;

            case "4":
            //                 wantToQuit = quit(command);
            break;

            case "5":
            //                 take(command);
            break;

            case "6":
            System.exit(0);
            break;
        }
        return wantToQuit;
    }
    
    private void MediumLibrary() 
    {            
       printMediumMenu();
        //                 
     
       boolean finished = false;
       while(! finished){
           finished = mediumMenu();
       }
        System.out.println("Thank you for playing.  Good bye.");
    }
    
    private void printMediumMenu(){
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("Medium menu!");
        System.out.println("type in what you want to add out of the different mediums");
        System.out.println();
        System.out.println("- Medium Menu -");
        System.out.println("1. CD");
        System.out.println("2. Vinyl");
        System.out.println("3. Tape");
        System.out.println("4. Audiotrack menu");
        System.out.println("5. Exit to Main menu");
        System.out.println();
        System.out.println("**********************************************************");
        mediumMenu();
    }
    
    private void printSecondMediumMenu(){
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("Medium menu!");
        System.out.println("Do you want to add antoher medium? then have a go");
        System.out.println("if you want to add tracks to your chosen medium, press 4");
        System.out.println();
        System.out.println("- Medium Menu -");
        System.out.println("1. CD");
        System.out.println("2. Vinyl");
        System.out.println("3. Tape");
        System.out.println("4. Audiotrack menu");
        System.out.println("5. Exit to Main menu");
        System.out.println();
        System.out.println("**********************************************************");
        mediumMenu();
    }
    
    /**
     * Given a command, process (that is: execute) the command.
     * @return true If the command ends the game, false otherwise.
     * @param command The command to be processed.
     */

    private boolean mediumMenu() 
    {
        
        String secondAnswer = reader.getInput();
        
        switch (secondAnswer) {
            //             default:
            //                 answer = Integer.parseInt(scanner.next());
            case "1":
            addNewCD();
            break;

            case "2":
            addNewVinyl();
            break;

            case "3":
            addNewTape();
            break;
            
            case "4":
            TrackLibrary();
            break;
  
            case "5":
            MediaLibrary();
            break;
  
        }
        printSecondMediumMenu();
        return wantToQuit;
    }
    
    private void TrackLibrary() 
    {            
       printAudioTrackMenu();              
     
       boolean finished = false;
       while(! finished){
           finished = audioTrackMenu();
       }
        System.out.println("Thank you for playing.  Good bye.");
    }
    
    private void printAudioTrackMenu(){
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("AudioTrack menu!");
        System.out.println("type in what type of audio you want to add ");
        System.out.println("If not, please press 6 to go back to medium menu or ");
        System.out.println("7 to go back to main menu ");
        System.out.println();
        System.out.println("- AudioTrack Menu -");
        System.out.println("1. Jingle");
        System.out.println("2. Effects");
        System.out.println("3. News");
        System.out.println("4. Music");
        System.out.println("5. Add tracks to medium");
        System.out.println("6. Exit to medium menu");
        System.out.println("7. Exit to main menu");
        System.out.println();
        System.out.println("**********************************************************");
        audioTrackMenu();
    }
    
    private void printSecondAudioTrackMenu(){
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("AudioTrack menu!");
        System.out.println("Do you want to add another track to this collection? ");
        System.out.println("Do you want to add these tracks to a medium? ");
        System.out.println();
        System.out.println("If not, please press 6 to go back to medium menu or ");
        System.out.println("7 to go back to main menu ");
        System.out.println();
        System.out.println("- AudioTrack Menu -");
        System.out.println("1. Jingle");
        System.out.println("2. Effects");
        System.out.println("3. News");
        System.out.println("4. Music");
        System.out.println("5. Add tracks to medium");
        System.out.println("6. Exit");
        System.out.println("7. Exit to main menu");
        System.out.println();
        System.out.println("**********************************************************");
        audioTrackMenu();
    }
    
    
    /**
     * Given a command, process (that is: execute) the command.
     * @return true If the command ends the game, false otherwise.
     * @param command The command to be processed.
     */

    private boolean audioTrackMenu() 
    {
        
        String thirdAnswer = reader.getInput();
        
        switch (thirdAnswer) {
            //             default:
            //                 answer = Integer.parseInt(scanner.next());
            case "1":
            addNewJingle();
            
            break;

            case "2":
            addNewEffects();
            break;

            case "3":
            addNewNews();
            break;
            
            
            case "4":
            addNewMusic();
            break;
            
            case "5":
            //
            break;

            case "6":
            MediumLibrary();
            break;
            
            case "7":
            MediaLibrary();
            break;
        }
        printSecondAudioTrackMenu();
        return wantToQuit;
    }
    
 
    
    /**
     * Medium section
     */
    
    /**
     * 
     */
    private void addNewCD(){
        medium.addNewCD();
    }
 
    
    private void addNewTape(){
        medium.addNewTape();  
    }
    
    private void addNewVinyl(){
        medium.addNewVinyl();
    }
    
    /**
     * AudioTrack section
     */
    
    /**
     * 
     */
        private void addNewJingle(){
        audioTracks.addNewJingle();
    }
    
        private void addNewEffects(){
        audioTracks.addNewEffects();
    }
    
    private void addNewNews(){
        audioTracks.addNewNews();
    }
    
    private void addNewMusic(){
        audioTracks.addNewMusic();
    }

}

//        private void printAddToMediumMenu(){
//         System.out.println("*********************************************************");
//         System.out.println();
//         System.out.println("Add to medium menu!");
//         System.out.println("type in what type of medium you want to add it to ");
//         System.out.println("If not, please press 6 to go back to medium menu or ");
//         System.out.println();
//         System.out.println("- AudioTrack Menu -");
//         System.out.println("1. CD");
//         System.out.println("2. Tape");
//         System.out.println("3. Vinyl");
//         System.out.println("4. HdFile");
//         System.out.println("5. Exit to audiotrack menu");
//         System.out.println("6. Exit to medium menu");
//         System.out.println("7. Exit to main menu");
//         System.out.println();
//         System.out.println("**********************************************************");
// 
//     }
//     
//     /**
//      * Given a command, process (that is: execute) the command.
//      * @return true If the command ends the game, false otherwise.
//      * @param command The command to be processed.
//      */
// 
//     private boolean addToMediumMenu() 
//     {
//         
//         String fourthAnswer = reader.getInput();
//         
//         switch (fourthAnswer) {
//             //             default:
//             //                 answer = Integer.parseInt(scanner.next());
//             case "1":
//     
//             
//             break;
// 
//             case "2":
//        
//             break;
// 
//             case "3":
//         
//             break;
//             
//             
//             case "4":
//        
//             break;
//             
//             case "5":
//             TrackLibrary();
//             break;
// 
//             case "6":
//             MediumLibrary();
//             break;
//             
//             case "7":
//             MediaLibrary();
//             break;
//         }
//         printAddToMediumMenu();
//         return wantToQuit;
//     }

