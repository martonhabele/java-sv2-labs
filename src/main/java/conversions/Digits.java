package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("lksdsl23édvn345élsd991");
        System.out.println(digits.getNumbers());
    }

    private List<Integer> numbers = new ArrayList<>();

    public void addDigitsToList(String text) {
        char[] temp = text.toCharArray();
        for (char c : temp) {
            if (Character.isDigit(c)) {
                String digitString = Character.toString(c);
                int number = Integer.parseInt(digitString);
                numbers.add(number);
            }
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}