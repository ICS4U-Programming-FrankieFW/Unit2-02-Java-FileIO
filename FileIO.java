
/**
* This program is used to see input and output into a new file which can be seen
* @author Frankie Fox
* @version 1.0
* @since   2024-25-03
*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outFile = "output.txt";
        File file = new File(inputFile);

        int sum;
        boolean errorOccurred = false;

        try {
             
            // Open file for writing
            PrintWriter output = new PrintWriter(new FileWriter(outFile)); 
            Scanner sc = new Scanner(file);
             // This is my while loop
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                // This splits the string 
                String[] arrStrings = line.split(" ");
                // I initialize the sum here 
                sum = 0;
                // This is my for loop for num strings 
                for (String numString : arrStrings) {
                    errorOccurred = false;

                    try {
                        // This is where I parse the string got an int
                        int num = Integer.parseInt(numString);
                        // This is the sum where I do num + sum
                        sum = num + sum;
                    } catch (NumberFormatException e) {
                        // Prints an error message
                        output.printf("Error: " + e + "\n"); 
                        errorOccurred = true;
                        // Break out of loop 
                        break; 
                    }
                }

                if (!errorOccurred) {
                    // Write sum to file
                    output.printf("Sum = " + sum + "\n"); 
                }
            }
              // Closes the PrintWriter after writing all sums
            output.close(); 
        } catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
}
