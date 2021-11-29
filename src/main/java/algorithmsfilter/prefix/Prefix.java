package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {
    public List<String> getWordsStartWith(List<String> words, String prefix) {
        List<String> result = new ArrayList<>();
        for (String scopedWord : words) {
            if (scopedWord.startsWith(prefix)) {
                result.add(scopedWord);
            }
        }
        return result;
    }
}