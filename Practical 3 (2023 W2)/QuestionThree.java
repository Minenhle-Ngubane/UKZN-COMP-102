import java.util.Scanner;
import java.util.Random;

public class QuestionThree {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rotation number (0-9): ");
        int rotation = scanner.nextInt();
        scanner.close();

        if (rotation >= 0 && rotation < array.length) {
            int[] rotatedArray = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                int newIndex = (i + rotation) % array.length;
                rotatedArray[i] = array[newIndex];
            }

            System.out.print("Rotated array: ");
            for (int num : rotatedArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            System.out.println("Invalid rotation number. Please enter a number between 0 and " + 
            (array.length - 1));
        }
    }
}
