import java.util.Scanner;

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class QuestionFive {
    public static void main(String[] args) {
        File file =  new File("Athlete.java");
        File outputFile = new File("headers.txt");

        if (!file.exists()) {
            System.out.printf("This file does not exist: %s", file);
            System.exit(0);
        }

        try {
            Scanner input = new Scanner(file);
            PrintWriter output = new PrintWriter(outputFile);

            // Read data from the input file and write it into the output file
            while(input.hasNext()) {
                String currentLine = input.nextLine().trim();
                
                if((currentLine.contains("public ") || currentLine.contains("private "))
                && currentLine.endsWith("{")){
                    output.println(currentLine);
                }
            }

            input.close();
            output.close();
        } catch (IOException ex) {
            System.out.println("Something went wrong");
        }
    }
}