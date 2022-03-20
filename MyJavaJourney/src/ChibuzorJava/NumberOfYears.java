package ChibuzorJava;

import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int numberOfMinutes = input.nextInt();

        int numberOfYears = numberOfMinutes / (60 * 24 * 365);

        int remainingDays = numberOfMinutes % (60 * 24 * 365);

        int days = remainingDays / (60 * 24);

        System.out.println(numberOfMinutes+ " minutes is approximately " +numberOfYears+ " years and " +days+ " days");
    }
}
