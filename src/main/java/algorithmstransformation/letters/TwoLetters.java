package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {
    public List<String> getFirstTwoLetters(List<String> words) {
        List<String> subStrings = new ArrayList<>();
        for (String scopedListItem : words) {
            subStrings.add(scopedListItem.substring(0, 2));
        }
        return subStrings;
    }
}