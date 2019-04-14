package pl.sda.scrum.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClosedBracketsTest {

    @Test
    public void shouldAllQueueBrecketsBeClosed() {
        boolean firstCheck = ClosedBrackets.gueueBreckets("[]");
        assertTrue(firstCheck);

        boolean secondCheck = ClosedBrackets.gueueBreckets("[][]");
        assertTrue(secondCheck);

        boolean thirdCheck = ClosedBrackets.gueueBreckets("[[][]]");
        assertTrue(thirdCheck);

        boolean forthCheck = ClosedBrackets.gueueBreckets("][");
        assertFalse(forthCheck);

        boolean fifthCheck = ClosedBrackets.gueueBreckets("][][");
        assertFalse(fifthCheck);

        boolean sixthCheck = ClosedBrackets.gueueBreckets("[]][[]");
        assertFalse(sixthCheck);
    }
}