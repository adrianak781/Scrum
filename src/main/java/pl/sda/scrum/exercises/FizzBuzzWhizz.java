package pl.sda.scrum.exercises;

public class FizzBuzzWhizz {
    public String fizzBuzzWhizz(Integer digit) {
        if (digit == null) {
            return "Nie dla null!"; // NULL VALUE CASE
        } else if ((digit % 3) == 0) {
            return "Fizz";          // WHEN VALUE IS DIVIDABLE BY 3
        } else if ((digit % 5) == 0) {
            return "Buzz";          // WHEN VALUE IS DIVIDABLE BY 5
        } else if ((digit % 2) != 0) {
            return "FizzBuzz";      // WHEN VALUE IS PRIME NUMBER
        } else {
            return String.valueOf(digit); // ELSE CASE
        }
    }
}
