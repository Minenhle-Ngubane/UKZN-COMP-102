import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a three-digit integer: ");
        int number = scanner.nextInt();
        
        if (isThreeDigitNumber(number)) {
            int originalNumber = number;
            int reversedNumber = 0;
            
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            
            System.out.println("Reversed integer: " + reversedNumber);
        } else {
            System.out.println("Please enter a valid three-digit integer.");
        }
        
        scanner.close();
    }
    
    private static boolean isThreeDigitNumber(int num) {
        return num >= 100 && num <= 999;
    }
}
