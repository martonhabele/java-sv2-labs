package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();
        List<String> names = new ArrayList<>(Arrays.asList("Tóth András", "Kiss Béla", "Nemecsek Ernő", "Fa Éva"));

        studyGroup.printStudyGroups(names);
    }

    public void printStudyGroups(List<String> students) {
        List<String> firstClass = new ArrayList<>();
        List<String> secondClass = new ArrayList<>();

        for (String name : students) {
            if ((name.length() <= 10)) {
                firstClass.add(name);
            } else {
                secondClass.add(name);
            }
        }
        System.out.println("Students in 1st class: " + firstClass + ", ");
        System.out.println("Students in 2nd class: " + secondClass + ", ");
    }
}