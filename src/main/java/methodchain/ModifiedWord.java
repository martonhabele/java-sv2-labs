package methodchain;

public class ModifiedWord {
    public String modify(String word) {
        char charater = word.toUpperCase().charAt(1);
        return word.toUpperCase().substring(0, 3).replace(charater, 'x').concat("y");
    }
}