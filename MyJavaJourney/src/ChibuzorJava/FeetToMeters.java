package ChibuzorJava;

import java.util.Scanner;

public class FeetToMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feetValue = scanner.nextDouble();

        double metersValue = feetValue * 0.305;
        System.out.println(feetValue+ " feet is " +metersValue+ " meters");
    }
}
