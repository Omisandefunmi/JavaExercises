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
                case 6:
                    System.out.println("On the Sixth day of Christmas, my true love sent to me");
                    break;
                case 7:
                    System.out.println("On the seventh day of Christmas, my true love sent to me");
                    break;
                case 8:
                    System.out.println("On the eighth day of Christmas, my true love sent to me");
                    break;
                case 9:
                    System.out.println("On the ninth day of Christmas, my true love sent to me");
                    break;
                case 10:
                    System.out.println("On the tenth day of Christmas, my true love sent to me");
                    break;
                case 11:
                    System.out.println("On the eleventh day of Christmas, my true love sent to me");
                    break;
                case 12:
                    System.out.println("On the twelfth day of Christmas, my true love sent to me");
                    break;

                default:
                    System.out.println("incorrect entry");
                    break;
            }

            switch (day){
                case 12:
                    System.out.println("12 drummers drumming,");
                case 11:
                    System.out.println("11 Eleven pipers piping,");
                case 10:
                    System.out.println("10 lords a-leaping,");
                case 9:
                    System.out.println("9 ladies dancing,");
                case 8:
                    System.out.println("8 maids a-milking,");
                case 7:
                    System.out.println("7 swans a-swimming,");
                case 6:
                    System.out.println("6 geese are laying,");
                case 5:
                    System.out.println("5 golden rings....,");
                case 4:
                    System.out.println("4 calling birds,");
                case 3:
                    System.out.println("3 French hens, ");
                case 2:
                    System.out.println("2 turtle doves and ");

                case 1:
                    System.out.println("a partridge in a pear tree");
            }

            System.out.println("Enter day");
            day = input.nextInt();

        }



    }
}
