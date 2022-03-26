package Chapter5;

import java.security.SecureRandom;

public class LoopPractice {
    public static void main(String[] args) {
        //infinite loop
//        for(;;){
//            System.out.println("print infinitely");
//        }
        
        int count = 0;
        SecureRandom random = new SecureRandom();
        for(;count <= 4;){
            System.out.println("IT IS WELL");

            count = random.nextInt(20);

            System.out.println(count);

            }
        }
    }

