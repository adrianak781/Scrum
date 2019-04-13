package pl.sda.scrum.exercises;

public class Greetings {

    public String greet(String name) {
        String result;

        if (name != null) {
            if (name == name.toUpperCase()){
                result = "WITAJ, " + name + "!";
            }else {
                result = "Witaj, " + name + "!";
            }
        } else {
            result = "Witaj, mój przyjacielu";
        }

        return result;
    }
}
