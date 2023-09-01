import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String reversedSentence = reverseWords(sentence);

        System.out.println("Reversed sentence: " + reversedSentence);

        scanner.close();
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
