import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        if (isDoubloon(input)) {
            System.out.println("\"" + input + "\" is a doubloon");
        } else {
            System.out.println("\"" + input + "\" is not a doubloon");
        }

        scanner.close();
    }

    public static boolean isDoubloon(String str) {
        str = str.replaceAll(" ", "").toLowerCase();

        int[] charCount = new int[26];

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                charCount[index]++;
            }
        }

        for (int count : charCount) {
            if (count != 0 && count != 2) {
                return false;
            }
        }

        return true;
    }
}
