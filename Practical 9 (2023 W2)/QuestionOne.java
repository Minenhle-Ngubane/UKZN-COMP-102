import java.util.Scanner;

import java.io.IOException;
import java.io.File;

public class QuestionOne {
    public static void main(String[] args) {
        File file = new File("text.txt");

        if (file.exists()) {
            String outputString = readFile(file);
            System.out.println(outputString);
        } else {
            System.out.printf("This file does not exist: %s", file);
        }
    }

    public static String readFile(File file) {
        String outputString = "";

        try {
            Scanner input = new Scanner(file);
    
            int numberOfLines = 0;
            int numberOfWords = 0;
            int sum = 0;

            while (input.hasNext()) {
                numberOfLines++;

                String line = input.nextLine().trim();
                if (!line.isEmpty()) {
                    String[] words = line.split("\\s+");
                    numberOfWords += words.length;

                    for (String word : words) {
                        sum += word.length();
                    }
                }
            }

            outputString += "There are "+ numberOfLines +" lines of text in the file.\n";
            outputString += "There are "+ numberOfWords +" words in the file.\n";
            outputString += "The average number length of words is " + (int)(sum / numberOfWords);

            input.close();
            return outputString;
        } catch(IOException ex) {
            System.out.println("Something went wrong");
            return outputString;
        }
    }
}