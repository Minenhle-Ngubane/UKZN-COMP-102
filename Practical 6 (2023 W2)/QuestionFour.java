import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        char mostFrequentChar = mostFrequent(input);

        System.out.println("Most frequent character: \"" + mostFrequentChar + "\"");

        scanner.close();
    }

    public static char mostFrequent(String str) {
        int[] charCount = new int[256];

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        char mostFrequentChar = ' ';
        int maxCount = 0;

        for (char c : str.toCharArray()) {
            if (charCount[c] > maxCount) {
                maxCount = charCount[c];
                mostFrequentChar = c;
            }
        }

        return mostFrequentChar;
    }
}
