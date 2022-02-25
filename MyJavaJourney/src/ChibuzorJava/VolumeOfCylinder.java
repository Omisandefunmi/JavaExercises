package ChibuzorJava;

import java.util.Scanner;

public class VolumeOfCylinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        double radius = input.nextDouble();

        System.out.print("Enter the length : ");
        double length = input.nextDouble();

        double area = radius * radius * 3.142857;
        double volume = area * length;

        System.out.println("The area of cylinder is " +area);
        System.out.println("The volume of cylinder is " +volume);


    }
}
