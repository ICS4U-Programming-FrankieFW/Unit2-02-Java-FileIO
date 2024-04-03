
/**
* This program is used to see input and output into a new file which can be seen
* @author Frankie Fox
* @version 1.0
* @since   2024-25-03
*/
import java.io.File;
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class
import java.util.*;

public class FilelO {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outFile = "output.txt";
        int = userInput
        String str = "This is what I call : crazy in coding standards";
        try {
            int userInput = Integer.parseInt(inputFile);
    FileWriter myWriter = new FileWriter("filename.txt");
    myWriter.write("This is what I call : crazy in coding standards!");
    new userInput
   
    String[] arrOfStr = str.split(":");
    
    
    myWriter.close();
    
    for (String a : arrOfStr)
        System.out.println(a);
    System.out.println("Successfully wrote to the file.");
}catch (IOException e) {
    System.out.println("An error has occurred");
    e.printStackTrace();   
    }
}
}
