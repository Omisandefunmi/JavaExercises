package chapter2;

import java.util.Scanner;

public class PolarBear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter final volume");
        int number1 = scanner.nextInt();

        System.out.println("Please enter initial volume");
        int number2 = scanner.nextInt();

        int Actual_volume = number1 - number2;
        System.out.println("The actual volume of water is "+number1+" minus " +number2+ " = " +Actual_volume );



    }
}

