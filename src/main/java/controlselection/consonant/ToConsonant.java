package controlselection.consonant;

public class ToConsonant {
    public final String VOWELS = "aeiou";

    public char transformToConsonants(char letter) {
        if (VOWELS.indexOf(letter) >= 0) {
            return (char) (letter + 1);
        }
        else {
            return letter;
        }
    }
}