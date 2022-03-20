package Chapter5;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
       /* (Triangle Printing Program) Write an application that displays the following
        patterns separately, one below the other. Use for loops to generate the patterns.
        All asterisks (*) should be printed by a single statement of the form System.out.print('*');
        which causes the asterisks to print side by side. A statement of the form System.out.println();
        can be used to move to the next line. A statement of the form System.out.print(' ');
        can be used to display a space for the last two patterns. There should be no other output
        statements in the program. [Hint: The last two patterns require that each line begin with an
        appropriate number of blank spaces.]

        */

        for (int i = 1; i <= 10; i++) {

            for (int counter = 1; counter <= i; counter++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {

            for (int counter = 1; counter <= i; counter++) {
                System.out.print("*");

            }
            System.out.println();

        }
        System.out.println();


//        int counter = 1;
//        int i = 1;
//        while (counter <= 10) {
//            System.out.print(" ");
//            counter++;
//
//            for (int i = 1; i < 10; i--) {
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int loopCount = 10; loopCount >= 1; loopCount--) {
            for (int spaceCount = 1; spaceCount <= (10 - loopCount); spaceCount++) {
                System.out.print(" ");
            }

                for (int characterCount = 1; characterCount <= loopCount; characterCount++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


