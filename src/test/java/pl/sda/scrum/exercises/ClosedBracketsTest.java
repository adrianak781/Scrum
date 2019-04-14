package pl.sda.scrum.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClosedBracketsTest {

    @Test
    public void shouldAllQueueBrecketsBeClosed() {
        ClosedBrackets closedBrackets = new ClosedBrackets();

        boolean firstCheck = closedBrackets.gueueBreckets("[]");
        assertTrue(firstCheck);

        boolean secondCheck = closedBrackets.gueueBreckets("[][]");
        assertTrue(secondCheck);

        boolean thirdCheck = closedBrackets.gueueBreckets("[[][]]");
        assertTrue(thirdCheck);

        boolean forthCheck = closedBrackets.gueueBreckets("][");
        assertFalse(forthCheck);

        boolean fifthCheck = closedBrackets.gueueBreckets("][][");
        assertFalse(fifthCheck);

        boolean sixthCheck = closedBrackets.gueueBreckets("[]][[]");
        assertFalse(sixthCheck);
    }
}