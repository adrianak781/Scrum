package pl.sda.scrum.exercises;

import java.util.ArrayList;
import java.util.List;

public class Greetings {

    public String greet(String name) {
        String result = "";

        if (name != null) {
            String number = "0123456789";
            String[] numbers = number.split("");
            for (String num : numbers) {
                if(name.contains(num)){
                    return result = "Z liczbami się nie witam.";
                }
            }
            if(name.contains(",")){
                String[] names = name.split(",");
                List<String> nonUpperCaseNames = new ArrayList<>();
                List<String> upperCaseNames = new ArrayList<>();
                for (int i = 0; i < names.length; i++) {
                    if (names[i] == names[i].toUpperCase()){
                        upperCaseNames.add(names[i]);
                    }else {
                        nonUpperCaseNames.add(names[i]);
                    }
                }
                result = nonUpperCaseNames.get(0);
                for (int i = 1; i < nonUpperCaseNames.size(); i++) {
                    if(i == nonUpperCaseNames.size()-1){
                        result = result + " i " + nonUpperCaseNames.get(i);
                        break;
                    }
                    result = result + ", " + nonUpperCaseNames.get(i);
                }
                result += ", witajcie!";
                if (upperCaseNames.isEmpty()){
                    return result;
                }else {
                    if (upperCaseNames.size() == 1){
                        result = result + " WITAJ " + upperCaseNames.get(0) + "!";
                    }else {
                        result = result + " " + upperCaseNames.get(0);
                        for (int i = 1; i < upperCaseNames.size(); i++) {
                            if (i == upperCaseNames.size() - 1) {
                                result = result + " I " + upperCaseNames.get(i);
                                break;
                            }
                            result = result + ", " + upperCaseNames.get(i);
                        }
                        return result + ", WITAJCIE!";
                    }
                }

            }else {
                if (name == name.toUpperCase()) {
                    result = "WITAJ, " + name + "!";
                } else {
                    result = "Witaj, " + name + "!";
                }
            }

        } else {
            result = "Witaj, mój przyjacielu";
        }

        return result;
    }
}
