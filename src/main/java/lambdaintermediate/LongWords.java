package lambdaintermediate;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongWords {
    private final List<String> words;

    public LongWords(List<String> words) {
        this.words = words;
    }

    public long getNumberOfWordsStartWith(String keyWord) {
        return words.stream()
                .filter(word -> word.startsWith(keyWord))
                .count();
    }

    public List<String> getLongerWords(int lengthLimit) {
        return words.stream()
                .filter(word -> word.length() > lengthLimit)
                .collect(Collectors.toList());
    }

    public Optional<String> getShortestWordContainingGivenCharacter(char character) {
        return words.stream()
                .filter(word -> word.indexOf(character) >= 0)
                .min(Comparator.comparing(String::length));
    }

    public List<String> getWords() {
        return words;
    }
}