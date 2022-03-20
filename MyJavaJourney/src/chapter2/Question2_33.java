package chapter2;

import java.util.Scanner;

public class Question2_33 {

    //Create a BMI calculator that reads the user’s weight in pounds and height in inches
    // (or, if you prefer, the user’s weight in kilograms and height in meters),
    // then calculates and displays the user’s body mass index.
    // Also, display the BMI categories and their values from the National Heart Lung
    //and Blood Institute
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInPounds = input.nextDouble();

        double bmi = weightInPounds / (heightInPounds * heightInPounds);
        System.out.println(bmi);

    }

}
