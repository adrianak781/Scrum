package pl.sda.scrum.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void shouldReturnSumFromSringsOrZeroIfNull(){
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("3,5");
        int sumNull = stringCalculator.add(null);
        int sumEmpty = stringCalculator.add("");

        assertEquals(8,sum);
        assertEquals(0,sumNull);
        assertEquals(0,sumEmpty);
    }

}