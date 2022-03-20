package tddPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SumTest {

    @Test
    public void testThatSumClassCanBeCreated(){
        // given
        Sum sum;
        // when
        sum = new Sum();
        // assert
        assertNotNull(sum);
    }

    @Test
    public void testThatSumCanPerformAddition(){

        Sum sum = new Sum();
        sum.addNumbers(1 + 1);


    }

}
