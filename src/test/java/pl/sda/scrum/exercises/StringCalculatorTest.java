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
    @Test
    public void shouldReturnSumForMoreThen2Digits(){
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("2,3,5");

        assertEquals(10,sum);
    }
    @Test
    public void shouldReturnSumForMoreThen2DigitsWhithNewLineMark(){
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("3\n5,3");

        assertEquals(11,sum);
    }
}