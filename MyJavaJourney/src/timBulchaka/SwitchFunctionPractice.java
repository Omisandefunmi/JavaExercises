package timBulchaka;

public class SwitchFunctionPractice {
    public static void main(String[] args) {

        int sunday = 0;

        switch (sunday){
            case 0:
                System.out.println(" the day is sunday");
                break;
            case 1:
                System.out.println("the day is monday");
                break;
            case 2:
                System.out.println("the day is tuesday");
                break;
            case 3:
                System.out.println(" the day is wednesday");
                break;
            case 4: case 5: case 6:
                System.out.println("its a day of the week");
        }

    }
}
