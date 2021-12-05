package methodoverloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassFiveA {
    private List<String> pupils = Arrays.asList("Jack", "John", "Jane", "Mary", "Mark", "Dave");

    public String getTodayTestedPupil(int number) {
        return pupils.get(number - 1);
    }

    public String getTodayTestedPupil(Number number) {
        return pupils.get(number.getValue() - 1);
    }

    public String getTodayTestedPupil(String numberWithWord) {
        return pupils.get(Number.valueOf(numberWithWord.toUpperCase()).getValue() - 1);
    }
}