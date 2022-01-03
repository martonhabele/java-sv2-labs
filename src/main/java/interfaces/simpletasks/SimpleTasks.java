package interfaces.simpletasks;

import java.util.List;

public class SimpleTasks implements Runnable {
    private List<String> tasks;

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    private void nextStep() {
        if (tasks != null && !tasks.isEmpty()) {
            tasks.remove(tasks.size() - 1);
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void run() {
        while (!tasks.isEmpty()) {
            nextStep();
        }
    }
}