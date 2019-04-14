package pl.sda.scrum.exercises;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers){
        if (numbers == null || numbers.length() == 0){
            return 0;
        }else {
            String delimeter = ",";
            if (numbers.contains("//") && numbers.contains("\n")){
                delimeter = numbers.substring(0,numbers.indexOf("\n")+1);
                delimeter = delimeter.substring(2,delimeter.indexOf("\n"));
                numbers = numbers.substring(numbers.indexOf("\n")+1);
            }
            numbers = numbers.replaceAll("\n", ",");
            numbers = numbers.replaceAll(",", delimeter);
            String[] numbersTable = numbers.split(delimeter);
            List<Integer> numbersList = new ArrayList<>();
            for (int i = 0; i < numbersTable.length; i++) {
                numbersList.add(Integer.valueOf(numbersTable[i]));
            }
            return numbersList.stream().mapToInt(Integer::intValue).sum();
        }
    }
}
