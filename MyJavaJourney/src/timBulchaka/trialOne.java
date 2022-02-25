package timBulchaka;

public class trialOne {
    public static void main(String[] args) {

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer minimum value is " +myMinIntValue);
        System.out.println("Integer maximum value is " +myMaxIntValue);

        int myMinShortValue = Short.MIN_VALUE;
        int myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short minimum value is " +myMinShortValue);
        System.out.println("Short maximum value is " +myMaxShortValue);

        byte myByteNumber = 101;
        short myShortNumber = 4567;
        int myIntegerNumber = 23900;

        long myLongLiteralValue = 50000L + (long) (10 * (myByteNumber + myIntegerNumber + myShortNumber));
        System.out.println(myLongLiteralValue);

        float myFloatValue =(float) 5.45;
        double myDoubleValue = 5.56;


    }

}
