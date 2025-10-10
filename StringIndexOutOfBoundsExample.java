import java.util.*;
public class StringIndexOutOfBoundsExample 
{
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter a word: ");
        String str = sc.nextLine();

        try {
            // Trying to access the 5th character (index 4)
            System.out.println("Character at index 4: " + str.charAt(4));
        } 
        catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Error: Invalid string index accessed");
            System.out.println("Exception message: " + ex.getMessage());
        }

        System.out.println("Program continues normally after handling exception...");
    }
}
