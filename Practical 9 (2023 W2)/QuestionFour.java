import java.util.Scanner;

import java.io.IOException;
import java.io.File;

public class QuestionFour {
    public static void main(String[] args) throws IOException {
        // Create new input file instance to read data from
        File file = new File("Athlete.java");
        Scanner input = new Scanner(file);

        // To track count of the brackets
        int openBracketCount = 0;
        int closedBracketCount = 0;

        // Increment count of brackets if they are found
        while (input.hasNext()) {
            String str = input.next();
            if (str.equals("{")) {
                openBracketCount++;
            } else if (str.length() > 1) { // if there is no empty character before open bracket
                char[] arr = str.toCharArray();
                if (String.valueOf(arr[arr.length-1]).equals("{")) {
                    openBracketCount++;
                }
            } else if (str.equals("}")) {
                closedBracketCount++;
            }
        }

        // Print the results on the console
        if(openBracketCount == closedBracketCount) {
            System.out.println("0 missing brackets");
        } else if (openBracketCount > closedBracketCount) {
            System.out.printf("%d missing closed bracket(s). \n", openBracketCount - closedBracketCount);
        } else {
            System.out.printf("%d missing open bracket(s). \n", closedBracketCount - openBracketCount);
        }

        // Close file
        input.close();
    }
}