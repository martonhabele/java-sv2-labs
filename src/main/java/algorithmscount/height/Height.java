package algorithmscount.height;

import java.util.List;

public class Height {
    public int countChildrenWithHeightGreaterThan(List<Integer> heights, int minimumHeight) {
        int counter = 0;
        for (Integer i : heights) {
            if (i > minimumHeight) {
                counter++;
            }
        }
        return counter;
    }
}