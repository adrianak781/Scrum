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
        Integer value = 3;
        assertEquals("Fizz", fizzBuzzWhizz.fizzBuzzWhizz(value));
    }
    @Test
    public void shouldReturnBuzzStringIfDigitIsDividableBy5() {
        Integer value = 5;
        assertEquals("Buzz", fizzBuzzWhizz.fizzBuzzWhizz(value));
    }
}