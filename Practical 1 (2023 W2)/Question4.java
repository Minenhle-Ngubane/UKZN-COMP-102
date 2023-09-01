import java.util.Scanner;
 
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a three-digit integer: ");
        int number = scanner.nextInt();
        
        if (isThreeDigitNumber(number)) {
            int originalNumber = number;
            int numDigits = 3; // Since we're checking for a three-digit number
            int sum = 0;
            
            while (number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numDigits);
                number /= 10;
            }
            
            if (sum == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong number");
            } else {
                System.out.println(originalNumber + " is not an Armstrong number");
            }
        } else {
            System.out.println("Please enter a valid three-digit integer.");
        }
        
        scanner.close();
    }
    
    private static boolean isThreeDigitNumber(int num) {
        return num >= 100 && num <= 999;
    }
}
