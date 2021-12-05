package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {
    private List<FieldPoint> fieldPointList = new ArrayList<>();

    public List<FieldPoint> getFieldPoints() {
        return fieldPointList;
    }

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... loggableFieldPoints) {
        if (timeOfLogging == null) {
            throw new IllegalArgumentException("Time of logging should not be null!");
        }
        for (FieldPoint scopedFieldPoint : loggableFieldPoints) {
            scopedFieldPoint.setTimeOfLogging(timeOfLogging);
            fieldPointList.add(scopedFieldPoint);
        }
    }
}