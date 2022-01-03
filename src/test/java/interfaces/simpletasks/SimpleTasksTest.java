package interfaces.simpletasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTasksTest {
    @Test
    void testEmptyList() {
        List<String> tasks = new ArrayList<>();
        SimpleTasks simpleTasks = new SimpleTasks(tasks);
        simpleTasks.run();

        assertEquals(0, simpleTasks.getTasks().size());
    }

    @Test
    void testList() {
        List<String> tasks = new ArrayList<>();
        tasks.add("stuff");
        tasks.add("morestuff");
        tasks.add("alotofstuff");
        SimpleTasks simpleTasks = new SimpleTasks(tasks);
        simpleTasks.run();

        assertEquals(0, simpleTasks.getTasks().size());
    }
}