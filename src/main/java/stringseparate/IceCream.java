package stringseparate;

import java.util.Arrays;
import java.util.List;

public class IceCream {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Ma kapható: ");
        List<String> desserts = Arrays.asList("csoki", "vanília", "eper", "citrom");    //fixed list

        for (int i = 0; i < desserts.size(); i++) {
            if (i != 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(desserts.get(i));
        }
        System.out.println(stringBuilder);
    }
}