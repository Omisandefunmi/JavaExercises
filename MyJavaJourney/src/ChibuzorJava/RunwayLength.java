package ChibuzorJava;

import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kindly enter speed: ");
        double speedValue = scanner.nextDouble();

        System.out.print("Kindly enter acceleration: ");
        double accelerationValue = scanner.nextDouble();

        double runwayLength = (speedValue * speedValue) / (2 * accelerationValue);
        System.out.printf("The minimum runway length for this airplane is %.3f", runwayLength);

    }
}
