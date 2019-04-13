package pl.sda.scrum.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingsTest {

    @Test
    public void greet() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam";
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Witaj, Adam!", result);
    }
}