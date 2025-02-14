import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        
        // Swapping numbers using a temporary variable
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        
        System.out.println("After swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        
        scanner.close();
    }
}
