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
    @Test
    public void shouldReturnSumForMoreThen2DigitsWhithOwnSeparatorDefinition(){
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("//;\n3;5;7");

        assertEquals(15,sum);
    }
    @Test
    public void shouldThrowExceoptionForNegativeNumbers(){
        StringCalculator stringCalculator = new StringCalculator();
        try {
            int sum = stringCalculator.add("3,-5");
        }catch (Exception e){
            assertEquals("Liczby ujemne nie są obsługiwane",e.getMessage());
        }
    }

    @Test
    public void shouldIgnoreNumbersHigherThenThousand(){
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("1002,5");

        assertEquals(7,sum);
    }
    @Test
    public void shouldAcceptMulticharacterSeparator(){
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("//[***]\n5***2***3");

        assertEquals(10,sum);
    }
    @Test
    public void shouldAcceptMultipleSeparators(){
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("//[*][%]\n3[*]5[%]6");

        assertEquals(14,sum);
    }
    @Test
    public void shouldAcceptMultipleSeparatorsAndMulticharacerSeparators(){
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("//[**][%]\n5**3%7");

        assertEquals(15,sum);
    }
}