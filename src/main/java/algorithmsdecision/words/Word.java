package algorithmsdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> words, String word) {
        boolean contains = false;
        for (String scopedWord : words) {
            if (scopedWord.length() > word.length()) {
                contains = true;
            }
        }
        return contains;
    }
}