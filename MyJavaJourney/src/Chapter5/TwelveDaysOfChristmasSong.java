package Chapter5;

import java.util.Scanner;

public class TwelveDaysOfChristmasSong {
    public static void main(String[] args) {
        /* (“The Twelve Days of Christmas” Song) Write an application that uses iteration and switch
statements to print the song “The Twelve Days of Christmas.” One switch statement should be
used to print the day (“first,” “second,” and so on). A separate switch statement should be used to
print the remainder of each verse. Visit the website en.wikipedia.org/wiki/The_Twelve_Days_
of_Christmas_(song) for the lyrics of the song.*/

        Scanner input = new Scanner(System.in);
        System.out.println("THE TWELVE DAYS OF CHRISTMAS");

        System.out.println("Enter day");
        int day = input.nextInt();


        while(day>0 && day <= 12) {

            switch (day){
                case 1:
                    System.out.println("On the first day of Christmas, my true love sent to me");
                    break;

                case 2:
                    System.out.println("On the second day of Christmas, my true love sent to me");
                    break;

                case 3:
                    System.out.println("On the third day of Christmas, my true love sent to me");
                    break;

                case 4:
                    System.out.println("On the fourth day of Christmas, my true love sent to me");
                    break;

                case 5:
                    System.out.println("On the fifth day of Christmas, my true love sent to me");
                    break;

                default:
                    System.out.println("incorrect entry");
            }

            switch (day){
                case 12:
                    System.out.println("12 days");
                case 11:
                    System.out.println("11 days");
                case 10:
                    System.out.println("10 days");
                case 9:
                    System.out.println("9 days");
                case 8:
                    System.out.println("8 days");
                case 7:
                    System.out.println("7 days");
                case 6:
                    System.out.println("6 days");
                case 5:
                    System.out.println("5 days");
                case 4:
                    System.out.println("4 days");
                case 3:
                    System.out.println("3 days ");
                case 2:
                    System.out.println("2 days");
                case 1:
                    System.out.println("1 days");
            }

            System.out.println("Enter day");
            day = input.nextInt();

        }



    }
}
