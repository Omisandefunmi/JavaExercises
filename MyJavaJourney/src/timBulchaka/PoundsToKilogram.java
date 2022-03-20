package timBulchaka;

import java.util.Scanner;

public class PoundsToKilogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double poundValue = scanner.nextDouble();

        double kilogramValue = (poundValue * 0.454);

        System.out.printf( "%.2f pounds is %.3f kilograms" ,poundValue, kilogramValue);
    }
        }
