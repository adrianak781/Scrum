package pl.sda.scrum.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingsTest {

    @Test
    public void shouldReturnGreetingForSingleName() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam";
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Witaj, Adam!", result);
    }

    @Test
    public void shouldReturnDefaultGreetingForNull() {
        //given
        Greetings greetings = new Greetings();
        String name = null;
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Witaj, mój przyjacielu", result);
    }
    @Test
    public void shouldReturnUpperCaseGreetingForUpperCaseName() {
        //given
        Greetings greetings = new Greetings();
        String name = "ADAM";
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("WITAJ, ADAM!", result);
    }

    @Test
    public void shouldReturnGreetingIfTwoNamesWasGiven() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza";
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Adam i Iza, witajcie!", result);
    }

    @Test
    public void shouldReturnGreetingIfThreeNamesWasGiven() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza,Robert";
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Adam, Iza i Robert, witajcie!", result);
    }

    @Test
    public void shouldReturnGreetingIfThreeNamesWasGivenWithUpperCaseName() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza,ROBERT";
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Adam, Iza, witajcie! WITAJ ROBERT!", result);
    }

    @Test
    public void shouldReturnNoGreetingsIfNameContainsNumbers() {
        //given
        Greetings greetings = new Greetings();
        String name = "1245";
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Z liczbami się nie witam.", result);
    }

}