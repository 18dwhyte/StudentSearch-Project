
/**
 * This function creates a menu object
 *
 * @author Dwayne Whyte
 * @version December 1, 2020
 */
import java.io.IOException;

public class ListMenu
{
     /**
     * Displays a list of character inputs available for the user.
     */
    public ListMenu()
    {
        System.out.println("[A]dd a student");
        System.out.println("[L]ist by major");
        System.out.println("[R]emove a student");
        System.out.println("[D]isplay a student");
        System.out.println("[Q]uit the program");
        System.out.println("Please enter a letter in the []");
    }
    
    /**
     * This method pauses the program, and makes the user press "Enter" to continue
     */
    public static void pause() throws IOException
    {
        System.out.print("Press Enter key to continue:");
        char c = (char) System.in.read();
    }
    
    /**
     * This method clears the screen
     */
    public static void clearScreen() 
    { 
        System.out.println("\f");
    }
}
