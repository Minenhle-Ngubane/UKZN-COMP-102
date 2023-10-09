import java.util.Scanner;

import java.io.File;
import java.io.PrintWriter;

public class QuestionThree {
    public static void main(String[] args) throws Exception {
        File file = new File("emailText.txt");
        File emailOutputFile = new File("emailOutputFile.txt");
        
        if (!file.exists()) {
           System.out.printf("This file does not exist: %s", file);
           System.exit(0);
        }

        try (
            Scanner input = new Scanner(file);
            PrintWriter output = new PrintWriter(emailOutputFile);
         ) {
            int iteration = 0; // Iteration count to control the While loop

            while (input.hasNext() && iteration < 12) {
                String str = input.next();

                if(str.contains("@") && str.contains(".")) {
                    output.println(str);
                    iteration++;
                }
            }
        }
    }
}