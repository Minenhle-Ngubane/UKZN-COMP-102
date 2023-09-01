import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter initial velocity: ");
        double initialVelocity = scanner.nextDouble();
        
        System.out.print("Enter acceleration: ");
        double acceleration = scanner.nextDouble();
        
        System.out.print("Enter time period: ");
        double time = scanner.nextDouble();
        
        double finalVelocity = initialVelocity + (acceleration * time);
        
        System.out.println("The final velocity is " + finalVelocity + " m/s");
        
        scanner.close();
    }
}
