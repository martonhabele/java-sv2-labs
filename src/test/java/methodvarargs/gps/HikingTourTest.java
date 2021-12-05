package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {
    HikingTour hikingTour = new HikingTour();

    @Test
    void testLogPoints() {
        hikingTour.logFieldPoints(LocalDateTime.of(2010, 01, 01, 9, 15),
                new FieldPoint(LocalDateTime.of(2010, 01, 01, 9, 20), 100.00, 100.00),
                new FieldPoint(LocalDateTime.of(2010, 01, 01, 9, 25), 105.00, 105.00));

        assertEquals(2, hikingTour.getFieldPoints().size());
        assertEquals(LocalDateTime.of(2010, 01, 01, 9, 15), hikingTour.getFieldPoints().get(1).getTimeOfLogging());
        assertEquals(105.00, hikingTour.getFieldPoints().get(1).getLatitude());
    }

    @Test
    void testWithNullTime() {
        IllegalArgumentException iaex = assertThrows(IllegalArgumentException.class, () -> hikingTour.logFieldPoints(null,
                new FieldPoint(LocalDateTime.of(2010, 01, 01, 9,10), 100.00,
                        100.00)));
        assertEquals("Time of logging should not be null!", iaex.getMessage());
    }
}