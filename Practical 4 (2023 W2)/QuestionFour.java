import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = howMany(input, "aeiouAEIOU");

        System.out.println("\"" + input + "\" has " + vowelCount + " vowels");

        scanner.close();
    }

    public static int howMany(String s, String chars) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (chars.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }
}
