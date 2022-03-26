package ChibuzorJava;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = input.nextInt();
        int loopTimes = 1;
        while(loopTimes <= 12){
            int multiplication = number * loopTimes;
            System.out.println(number+ " * " +loopTimes+ " = " +multiplication);

            loopTimes++;
        }

    }
}
