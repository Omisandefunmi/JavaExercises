package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class RandomMathQuiz {
    public static void main(String[] args) {
        Random random = new Random();
        int loopCounter = 1;
        int correctAnswerCounter = 0;
        int wrongAnswerCounter = 0;


        while (loopCounter <= 10) {

            int firstRandomNumber = random.nextInt(100);
            int secondRandomNumber = random.nextInt(100);
            char randomOperator;
            double result;

            switch (random.nextInt(4)){
                case 0:
                    randomOperator = '+';
                    result = firstRandomNumber + secondRandomNumber;
                    break;
                case 1:
                    randomOperator = '-';
                    result = firstRandomNumber - secondRandomNumber;
                    break;
                case 2:
                    randomOperator = '*';
                    result = firstRandomNumber * secondRandomNumber;
                    break;
                case 3:
                    randomOperator = '/';
                    result = firstRandomNumber / secondRandomNumber;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + random.nextInt(4));
            }

            Scanner input = new Scanner(System.in);
            System.out.println(firstRandomNumber+ " "+randomOperator+ " "+secondRandomNumber+ " = ");
            double answer = input.nextDouble();
            if (result == answer)
                correctAnswerCounter++;
            else
                wrongAnswerCounter++;

            loopCounter++;
        }

        System.out.println();
        System.out.println("Total correct answer: " +correctAnswerCounter);
        System.out.println("Total wrong answer:  "+wrongAnswerCounter);

        int score = correctAnswerCounter - wrongAnswerCounter;
        System.out.println("Your score is " +score);
    }
}
