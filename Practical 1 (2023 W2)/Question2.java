import java.util.Scanner;
 
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter initial amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter annual interest rate (%): ");
        double rate = scanner.nextDouble() / 100; // Convert percentage to decimal
        
        System.out.print("Enter time (years): ");
        double time = scanner.nextDouble();
        
        double finalAmount = principal * (1 + rate * time);
        
        System.out.println("The final amount is: " + finalAmount);
        
        scanner.close();
    }
}
