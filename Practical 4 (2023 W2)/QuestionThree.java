import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = scanner.nextLine();

        System.out.print("Enter second string: ");
        String second = scanner.nextLine();

        boolean areEqual = equalsIgnoreCase(first, second);

        if (areEqual) {
            System.out.println("\"" + first + "\" and \"" + second + "\" are equal");
        } else {
            System.out.println("\"" + first + "\" and \"" + second + "\" are not equal");
        }

        scanner.close();
    }

    public static boolean equalsIgnoreCase(String one, String two) {
        if (one.length() != two.length()) {
            return false;
        }

        for (int i = 0; i < one.length(); i++) {
            char charOne = Character.toLowerCase(one.charAt(i));
            char charTwo = Character.toLowerCase(two.charAt(i));

            if (charOne != charTwo) {
                return false;
            }
        }

        return true;
    }
}
