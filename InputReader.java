import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author    Henrique Rocha lemos 
 * @version   0.2
 * @Bibliography From: Michael Kölling and David J. Barnes; Version [ 0.1 (2011.07.31)];
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getInput()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();
        
        return inputLine;
    }
    
    public int getInputInt()
    {
        if(reader.hasNextInt() == true){
         System.out.print("> ");    
         int inputLine = reader.nextInt();
         return inputLine;}
         else return 0;
        }

    
    public long getInputLong()
    {
        if(reader.hasNextLong() == true){
        System.out.print("> ");  
        long inputLine = reader.nextLong();
        return inputLine;}
        else return 0;
    }
}
