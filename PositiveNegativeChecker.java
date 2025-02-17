public class PositiveNegativeChecker {
    public static void main(String[] args) {
        double number = -5.5; // Change this value to test different numbers

        String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println("The number is " + result + ".");
    }
}


//checking +ve or -ve number using java 8 Optional class

//import java.util.Optional;
//
//public class PositiveNegativeChecker {
//    public static void main(String[] args) {
//        Double number = 10.0; //
//        Optional<Double> optionalNumber = Optional.ofNullable(number);
//        String result = optionalNumber
//            .map(n -> n > 0 ? "positive" : n < 0 ? "negative" : "zero")
//            .orElse("Number is null");
//
//        System.out.println("The number is " + result + ".");
//    }
//}


//check +ve or -ve number using switch case

//public class PositiveNegativeChecker {
//    public static void main(String[] args) {
//        double number = 0; // Change this value to test different numbers
//
//        switch ((int) Math.signum(number)) {
//            case 1:
//                System.out.println("The number is positive.");
//                break;
//            case -1:
//                System.out.println("The number is negative.");
//                break;
//            default:
//                System.out.println("The number is zero.");
//                break;
//        }
//    }
//}


