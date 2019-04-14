package pl.sda.scrum.exercises;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class ClosedBrackets {


    public boolean gueueBreckets(String string) {
        Queue<String> queue = new LinkedBlockingQueue<>();

        String[] characters = string.split("");
        if (characters[0].equals("]")) {
            return false;
        } else {
            for (int i = 0; i < characters.length; i++) {
                if(characters[i].equals("[")) {
                    AddToQueue(queue, characters[i]);
                }else {
                    if (!queue.isEmpty()) {
                        RemoveBracketPairOrElseAddToQueue(queue, characters, i);
                    }
                }
            }
        }
        if (queue.isEmpty())return true;
        else return false;
    }

    private void AddToQueue(Queue<String> queue, String character) {
        insertToQueue(queue, character);
    }

    private void RemoveBracketPairOrElseAddToQueue(Queue<String> queue, String[] characters, int i) {
        if (queue.peek().contains("[")) {
            queue.poll();
        } else {
            insertToQueue(queue, characters[i]);
        }
    }

    private void insertToQueue(Queue<String> queue, String character) {
        queue.add(character);
    }


}
