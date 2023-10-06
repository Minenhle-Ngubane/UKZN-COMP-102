import java.util.Scanner;

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class QuestionThree {
    public static void main(String[] args) throws IOException {
        // Create new input file instance to read data from
        File file = new File("emailText.txt");
        Scanner input = new Scanner(file);

        // Create new output file instance to write data into
        File emailOutputFile = new File("emailOutputFile.txt");
        PrintWriter output = new PrintWriter(emailOutputFile);

        int iteration = 0; // Iteration count to control the While loop

        // Find email address from emailText.txt and write it into emailOutputFile.txt
        while (input.hasNext() && iteration < 12) {
            String str = input.next();

            if(str.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
                output.println(str);
                iteration++;
            }
        }

        // Close input and output file
        input.close();
        output.close();
    }
}