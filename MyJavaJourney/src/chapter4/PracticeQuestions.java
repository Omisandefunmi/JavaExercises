package chapter4;

import java.util.Scanner;

public class PracticeQuestions {
    public static void main(String[] args) {

//        int x = 0;
//        x+= x++ -5;
//        System.out.println(x);
        Scanner input = new Scanner(System.in);

        System.out.println("input number");

        int number = input.nextInt();
        while(number>= 1){
           int factorialOfNumber =  number * (number - 1);
            factorialOfNumber = 0 + factorialOfNumber ;
           number--;
            System.out.println(factorialOfNumber);
        }

    }
}
