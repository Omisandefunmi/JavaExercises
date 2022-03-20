package Chapter5;

import java.util.Scanner;

public class StudentLetterGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
        int dCounter = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Kindly enter the name of the student");
            String nameOfStudent = input.next();
            System.out.println("Kindly input the letter grade between A-D");
            String grades = input.next().toUpperCase();

            switch (grades) {
                case "A":
                    aCounter++;
                    break;
                case "B":
                    bCounter++;
                    break;
                case "C":
                    cCounter++;
                    break;
                case "D":
                    dCounter++;
                    break;
            }

        }
        System.out.println(aCounter + " scored A");
        System.out.println(bCounter + " scored B");
        System.out.println(cCounter + " scored C");
        System.out.println(dCounter + " scored D");
    }
}
