package pl.sda.scrum.exercises;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers){
        if (numbers.equals(null) || numbers.length() == 0){
            return 0;
        }else {
            String[] numbersTable = numbers.split(",");
            List<Integer> numbersList = new ArrayList<>();
            for (int i = 0; i < numbersTable.length; i++) {
                numbersList.add(Integer.valueOf(numbersTable[i]));
            }
            return numbersList.stream().mapToInt(Integer::intValue).sum();
        }
    }
}
