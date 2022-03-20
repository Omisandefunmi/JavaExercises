package Chapter5;

import java.util.Scanner;

public class StudentLetterGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfAEntered = 0;
        int numberOfBEntered = 0;
        int numberOfCEntered = 0;
        int numberOfDEntered = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Kindly enter the name of the student");
            String nameOfStudent = input.next();
            System.out.println("Kindly input the letter grade between A-D");
            String grades = input.next().toUpperCase();

            switch (grades) {
                case "A":
                    numberOfAEntered++;
                    break;
                case "B":
                    numberOfBEntered++;
                    break;
                case "C":
                    numberOfCEntered++;
                    break;
                case "D":
                    numberOfDEntered++;
                    break;
                default:
                    System.out.println("You have entered an invalid grade");
            }

        }
        System.out.println(numberOfAEntered + " students scored A");
        System.out.println(numberOfBEntered + " students scored B");
        System.out.println(numberOfCEntered + " students scored C");
        System.out.println(numberOfDEntered + " students scored D");
    }
}
