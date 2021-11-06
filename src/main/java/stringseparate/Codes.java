package stringseparate;

import java.util.Arrays;
import java.util.List;

public class Codes {
    public static void main(String[] args) {
        Codes codes = new Codes();
        List<String> codeSet = Arrays.asList("T57fbj", "3tcu45", "f578GVHd");

        System.out.println(codes.getCodesStartWithLetter(codeSet));
    }

    public String getCodesStartWithLetter(List<String> codeSet) {
        StringBuilder stringBuilder = new StringBuilder();
        char firstCharacter;
        for (int i = 0; i < codeSet.size(); i++) {
            if (Character.isLetter(codeSet.get(i).charAt(0))) {
                stringBuilder.append(codeSet.get(i));
                if (i != codeSet.size() - 1){
                    stringBuilder.append(", ");
                }
            }
        }
        return stringBuilder.toString();
    }
}