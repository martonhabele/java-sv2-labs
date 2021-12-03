package methodpass;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {
    @Test
    void testSizeChange() {
        List<Window> windows = new ArrayList<>();
        windows.add(new Window("bedroom", 120, 90));
        windows.add(new Window("kitchen", 110, 80));

        WindowOperation windowOperation = new WindowOperation();
        windowOperation.riseSize(windows, 10);
        assertEquals(100, windows.get(0).getHeight());
        assertEquals(90, windows.get(1).getHeight());
    }
}