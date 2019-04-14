package pl.sda.scrum.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void shouldReturnSumFromSringsOrZeroIfNull(){
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("3,5");

        assertEquals(8,sum);
    }

}