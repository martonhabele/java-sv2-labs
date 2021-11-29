package algorithmsmax.hill;

import java.util.List;

public class Hill {
    public int getMax(List<Integer> hillTops) {
        int maximumHeight = hillTops.get(0);
        for (int scopedHillTop : hillTops) {
            if (scopedHillTop > maximumHeight) {
                maximumHeight = scopedHillTop;
            }
        }
        return maximumHeight;
    }
}