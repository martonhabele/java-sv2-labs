package algorithmsmax.temperature;

import java.util.List;

public class Temperature {
    public int getMin(List<Integer> temperatures) {
        int minimumTemp = temperatures.get(0);
        for (int scopedTemperature : temperatures) {
            if (scopedTemperature < minimumTemp) {
                minimumTemp = scopedTemperature;
            }
        }
        return minimumTemp;
    }
}