import java.util.*;
public class RemoveWhiteSpaces
 {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = xyz.nextLine();

        // Remove all white spaces using replaceAll
        String result = str.replaceAll("\\s", "");

        System.out.println("String without spaces: " + result);

        
    }
}
