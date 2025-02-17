import java.util.Scanner;

public class PrintDigitsWithDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        double number = scanner.nextDouble();
        scanner.close();

        System.out.println("The digits of the number are:");
        printDigits(number);
    }

    public static void printDigits(double number){
		
		if(number < 0){
			number = -number;
			System.out.println("-");
		}

	String numberStr = String.valueOf(number);
	for(char ch : numberStr.toCharArray()){
		if(ch == '.'){
			System.out.println("Decimal point");
		}
		else{
			System.out.println(ch);
		}
	}
	}
    
}
