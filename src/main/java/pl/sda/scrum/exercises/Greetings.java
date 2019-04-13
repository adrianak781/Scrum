package pl.sda.scrum.exercises;

public class Greetings {

    public String greet(String name) {
        String result = "";

        if (name != null) {
            if(name.contains(",")){
                String[] names = name.split(",");
                result = names[0];
                for (int i = 1; i < names.length; i++) {
                    if(i == names.length-1){
                        result= result + " i " + names[i];
                        break;
                    }
                    result = result + ", " + names[i];
                }
                return result + ", witajcie!";

            }
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
