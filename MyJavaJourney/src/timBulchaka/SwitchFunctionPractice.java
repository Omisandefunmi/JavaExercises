package timBulchaka;

import java.util.Scanner;

public class SwitchFunctionPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day of the week ");
        String dayOfTheWeek = input.nextLine();

        switch (dayOfTheWeek) {
            case "Sunday": {
                System.out.println("Oya, dress up and go to church;");
            }
            break;
            case "Monday": {
                System.out.println("Yeah, its Monday, hope your weekend went well");
            }
            break;
            case "Tuesday": {
                System.out.println("Yeah, its Tuesday, first day for database");
            }
            break;
            case "Wednesday": {
                System.out.println("Yeah, its Wednesday, second day for database");
            }
            break;
            case "Thursday": {
                System.out.println("Yeah, its Thursday, a day before we start shouting TGIF");
            }
            break;
            case "Friday": {
                System.out.println("Yeah, its Friday,TGIF!!!");
            }
            break;
            default: {
                System.out.println("Its Saturday, its time to take care of the house");
            }


        }
    }
}
