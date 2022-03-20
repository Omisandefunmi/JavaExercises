package ChibuzorJava;

import java.util.Scanner;

public class AverageAcceleration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting velocity: ");
        double startingVelocity = scanner.nextDouble();

        System.out.print("Enter ending velocity: ");
        double endingVelocity = scanner.nextDouble();

        System.out.print("Enter time span (in seconds): ");
        double timeSpan = scanner.nextDouble();

        double averageAcceleration = (endingVelocity - startingVelocity) / timeSpan;
        System.out.printf("The average acceleration is %.4f" , averageAcceleration);


    }
}
