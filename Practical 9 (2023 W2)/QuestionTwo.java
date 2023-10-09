import java.util.Scanner;

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class QuestionTwo {
    public static void main(String[] args) {
        File file = new File("separateData.txt");
        
        if (file.exists()) {
            String[] studentSurnames = readFileAndGetStudentSurnames(file);
            createFileForEachStudent(studentSurnames, file);
        } else {
            System.out.printf("This file does not exist: %s", file);
        }
    }

    public static void createFileForEachStudent(String[] studentSurnames, File file) {
        for(int i = 0; i < studentSurnames.length; i++){
            File outFile = new File(studentSurnames[i]+".txt");
            
            try {
                PrintWriter output = new PrintWriter(outFile);
                Scanner newInput = new Scanner(file); // Reopen the input file for each student

                while (newInput.hasNext()) {
                    String str = newInput.nextLine();
                    if(str.contains(studentSurnames[i]+" ")) {
                        output.println(str);
                    }
                }
                
                newInput.close();
                output.close();
            } catch (IOException ex) {
                System.out.println("Something went wrong");
            }
        }
    }

    public static String[] readFileAndGetStudentSurnames(File file) {
        int iteration = 0; // Counter to control while loop
        String[] studentSurnames = new String[3]; // Array to store student surnames

        try {
            Scanner input = new Scanner(file);

            // Read input file and store student surnames (first 3 lines)
            while (input.hasNext() && iteration < 3) {
                studentSurnames[iteration] = input.next();
                iteration++;
            }

            input.close();
            return studentSurnames;
        } catch (IOException ex) {
            System.out.println("Something went wrong");
            return studentSurnames;
        }
    }
}