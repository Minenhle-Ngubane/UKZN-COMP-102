import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        
        if (number <= 1) {
            isPrime = false;
        }
        
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
        
        scanner.close();
    }
}