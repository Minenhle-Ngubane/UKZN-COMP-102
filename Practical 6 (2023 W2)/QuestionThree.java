import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        if (containsDigit(input)) {
            System.out.println("\"" + input + "\" contains at least 1 digit");
        } else {
            System.out.println("\"" + input + "\" does not contain a digit");
        }

        scanner.close();
    }

    public static boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
