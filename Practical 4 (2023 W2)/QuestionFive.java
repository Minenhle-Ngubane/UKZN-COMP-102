import java.util.Arrays;
import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = scanner.nextLine();

        System.out.print("Enter second string: ");
        String second = scanner.nextLine();

        boolean areAnagrams = isAnagram(first, second);

        if (areAnagrams) {
            System.out.println("\"" + first + "\" and \"" + second + "\" are anagrams");
        } else {
            System.out.println("\"" + first + "\" and \"" + second + "\" are not anagrams");
        }

        scanner.close();
    }

    public static boolean isAnagram(String one, String two) {
        char[] charArrayOne = one.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] charArrayTwo = two.replaceAll("\\s", "").toLowerCase().toCharArray();

        Arrays.sort(charArrayOne);
        Arrays.sort(charArrayTwo);

        return Arrays.equals(charArrayOne, charArrayTwo);
    }
}
