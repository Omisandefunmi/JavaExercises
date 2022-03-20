package ChibuzorJava;
import java.util.Scanner;

public class InterestRateCalculator {
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter monthly savings: ");
        double monthlySavingsValue = input.nextDouble();

        double interestRate = 0.00417;

        double interestValue = (1 + interestRate);
        double firstMonthRate = monthlySavingsValue * (interestValue);

        double secondMonthRate = (monthlySavingsValue + firstMonthRate) * (interestValue) ;
        double thirdMonthRate = (monthlySavingsValue + secondMonthRate) * (interestValue);

        double fourthMonthRate = (monthlySavingsValue + thirdMonthRate) * (interestValue);
        double fifthMonthRate = (monthlySavingsValue + fourthMonthRate) * (interestValue);

        double sixthMonthRate = (monthlySavingsValue + fifthMonthRate) * (interestValue);
        System.out.printf("After the sixth month, the account value is: $%.2f" , sixthMonthRate);


    }
}


