package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("Food", "Lamp", "Books");
        System.out.println(importantThings);

        List<String> moreImportantThings = new ArrayList(Arrays.asList(importantThings));
        moreImportantThings.add("Clothes");
        System.out.println(moreImportantThings);
    }
}