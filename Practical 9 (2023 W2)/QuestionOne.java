import java.util.Scanner;

import java.io.IOException;
import java.io.File;

public class QuestionOne {
    public static void main(String[] args) throws IOException {
        // Create new input file instance to read data from
        File file = new File("text.txt");
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

        // Print results to the console
        System.out.printf("There are %d lines of text in the file.\n", numberOfLines);
        System.out.printf("There are %d words in the file.\n", numberOfWords);
        System.out.printf("The average number length of words is %d.", (int)(sum / numberOfWords));

        // Close inout file
        input.close();
    }
}