package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Path path = Paths.get("src/main/java/introexceptionwritefile/resources/tasks.txt");
        List<String> tasks = new ArrayList<>();
        boolean quitProgram = false;
        while (!quitProgram) {
            System.out.println("Your can add new task here. Hit the x key to quit!");
            String task = scanner.nextLine();
            if (task.equalsIgnoreCase("x")) {
                quitProgram = true;
            }
            else tasks.add(task);
        }
    try {
        Files.write(path, tasks);
    } catch (IOException ioe) {
        throw new IllegalStateException("Cannot write file!", ioe);
        }
    }
}