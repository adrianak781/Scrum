package pl.sda.scrum.exercises;

import org.junit.Test;
import org.mockito.internal.matchers.Null;

import static org.junit.Assert.*;

public class FizzBuzzWhizzTest {
    FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
    @Test
    public void shouldCatchNullValue() {
        Integer value = null;
        assertEquals("Nie dla null!", fizzBuzzWhizz.fizzBuzzWhizz(value));
    }

    @Test
    public void shouldReturnFizzStringIfDigitIsDividableBy3() {
        Integer value = 9;
        assertEquals("Fizz", fizzBuzzWhizz.fizzBuzzWhizz(value));
    }
    @Test
    public void shouldReturnBuzzStringIfDigitIsDividableBy5() {
        Integer value = 20;
        assertEquals("Buzz", fizzBuzzWhizz.fizzBuzzWhizz(value));
    }
    @Test
    public void shouldReturnFizzBuzzStringIfDigitIsDividableBy3And5() {
        Integer value = 15;
        assertEquals("FizzBuzz", fizzBuzzWhizz.fizzBuzzWhizz(value));
    }
    @Test
    public void shouldReturnWhizzStringIfDigitIsPrimeNumber() {
        Integer value = 13;
        assertEquals("Whizz", fizzBuzzWhizz.fizzBuzzWhizz(value));
    }
    @Test
    public void shouldReturnFizzWhizzStringIfDigitIs3() {
        Integer value = 3;
        assertEquals("FizzWhizz", fizzBuzzWhizz.fizzBuzzWhizz(value));
    }
    @Test
    public void shouldReturnBuzzWhizzStringIfDigitIs5() {
        Integer value = 5;
        assertEquals("BuzzWhizz", fizzBuzzWhizz.fizzBuzzWhizz(value));
    }

}