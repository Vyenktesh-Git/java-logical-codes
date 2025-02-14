import java.util.Scanner;

public class SwapNumbersArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        
        // Swapping numbers using arithmetic operations
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        
        System.out.println("After swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        
        scanner.close();
    }
}
