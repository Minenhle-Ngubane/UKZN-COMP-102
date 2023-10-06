import java.util.Scanner;

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class QuestionTwo {
    public static void main(String[] args) throws IOException {
        // Create new input file instance to read data from
        File file = new File("separateData.txt");
        Scanner input = new Scanner(file);

        // Counter to control while loop
        int iteration = 0; 

        // Array to store student surnames
        String[] studentSurnames = new String[3];
        
        // Read input file and store student surnames (first 3 lines)
        while (input.hasNext() && iteration < 3) {
            studentSurnames[iteration] = input.next();
            iteration++;
        }

        // Close input file
        input.close();

        for(int i = 0; i < studentSurnames.length; i++){
            // Create new output file for each student to store their marks
            File outFile = new File(studentSurnames[i]+".txt");
            PrintWriter output = new PrintWriter(outFile);

            // Reopen the input file for each student
            Scanner newInput = new Scanner(file);

            while (newInput.hasNext()) {
                String str = newInput.nextLine();
                if(str.contains(studentSurnames[i]+" ")) {
                    output.println(str);
                }
            }
            
            // Close input and output file
            newInput.close();
            output.close();
        }
    }
}