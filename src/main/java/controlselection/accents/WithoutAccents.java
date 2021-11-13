package controlselection.accents;

public class WithoutAccents {
    public static final String LETTERS_WITH_ACCENTS = "áéíóöőüűÁÉÍÓÖŐÜŰ";
    public static final String LETTERS_WITHOUT_ACCENTS = "aeiooouuAEIOOOUU";

    public char cutAccents(char letter) {
        int i = LETTERS_WITH_ACCENTS.indexOf(letter);
        if (i >= 0) {
            return LETTERS_WITHOUT_ACCENTS.charAt(i);
        }
        else {
            return letter;
        }
    }
}