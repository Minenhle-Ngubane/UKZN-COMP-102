import java.util.Scanner;

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class QuestionFive {
    public static void main(String[] args) throws IOException {
        // Create new input file instance to read data from
        File file =  new File("Athlete.java");
        Scanner input = new Scanner(file); 

        // Create new output file instance to write data into
        File outputFile = new File("headers.txt");
        PrintWriter output = new PrintWriter(outputFile);

        // Read data from the input file and write it into the output file
        while(input.hasNext()) {
            String currentLine = input.nextLine().trim();
            
            if((currentLine.contains("public ") || currentLine.contains("private "))
             && currentLine.endsWith("{")){
                output.println(currentLine);
            }
        }

        // Close input and output file
        input.close();
        output.close();
    }
}