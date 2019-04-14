package pl.sda.scrum.exercises;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class ClosedBrackets {

    public static boolean gueueBreckets(String string) {
        Queue<String> queue = new LinkedBlockingQueue<>();

        String[] characters = string.split("");
        if (characters[0].equals("]")) {
            return false;
        } else {
            for (int i = 0; i < characters.length; i++) {
                if(characters[i].equals("[")) {
                    queue.add(characters[i]);
                }else {
                    if (!queue.isEmpty()) {
                        if (queue.peek().contains("[")) {
                            queue.poll();
                        } else {
                            queue.add(characters[i]);
                        }
                    }
                }
            }
        }
        if (queue.isEmpty())return true;
        else return false;
    }
}
