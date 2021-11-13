package controliteration.day;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {
    Day day;

    @BeforeEach
    void init() {
        day = new Day();
        day.addHour(new Hour(1));
        day.addHour(new Hour(12));
    }

    @Test
    void testDay() {
        day.setDayPeriod();
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(0).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(1).getPeriod());
    }
}