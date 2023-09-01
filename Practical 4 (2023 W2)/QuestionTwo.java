import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        StringBuilder capitalizedSentence = new StringBuilder();
        boolean newWord = true;

        for (char c : sentence.toCharArray()) {
            if (newWord && Character.isLetter(c)) {
                capitalizedSentence.append(Character.toUpperCase(c));
                newWord = false;
            } else {
                capitalizedSentence.append(c);
            }

            if (Character.isWhitespace(c)) {
                newWord = true;
            }
        }

        System.out.println("Capitalized sentence: " + capitalizedSentence.toString());

        scanner.close();
    }
}
