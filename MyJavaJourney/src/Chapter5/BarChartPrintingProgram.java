package Chapter5;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
//        (Bar-Chart Printing Program) One interesting application of computers is to display
//        graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
//        number that’s read, your program should display the same number of adjacent asterisks.
//        For example, if your program reads the number 7, it should display *******.
//        Display the bars of asterisks after you read all five numbers.
        //Scanner input = new Scanner(System.in);
        SecureRandom input = new SecureRandom();
        int number = 0;
        int counter = 0;
        char chartCharacter = '*';

        int numberGenerated = input.nextInt(30);

        while (counter < 5) {
                for (int j = 1; j <= numberGenerated; j++) {
                    System.out.print(chartCharacter);
                }
                System.out.println();
                numberGenerated = input.nextInt(30);
                counter++;
            }

        }

    }
