import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("The digits of the number are:");
        printDigits(number);
    }

    public static void printDigits(int number) {
        if (number == 0) {
            System.out.println(0);
            return;
        }

        if (number < 0) {
            number = -number;         }

        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            System.out.println(digit);
        }
    }
}
