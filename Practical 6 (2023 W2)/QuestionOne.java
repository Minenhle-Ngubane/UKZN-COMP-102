import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        
        int rows = scanner.nextInt();
        
        displayPyramid(rows);
        
        scanner.close();
    }

    public static void displayPyramid(int rows) {
        int maxNumber = rows * (rows + 1) / 2;
        int maxDigitWidth = Integer.toString(maxNumber).length();

        for (int i = 1, currentNumber = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(String.format("%" + (maxDigitWidth + 1) + "s", " "));
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                String numberStr = currentNumber < 10 ? "  " + currentNumber :" " + currentNumber;
                System.out.print(String.format("%" + maxDigitWidth + "s", numberStr));
                currentNumber++;
            }

            System.out.println();
        }
    }
}
