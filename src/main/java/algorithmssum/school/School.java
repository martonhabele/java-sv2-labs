package algorithmssum.school;

import java.util.List;

public class School {
    public int getNumberOfStudents(List<Integer> headcounts) {
        int numberOfStudents = 0;
        for (Integer counter : headcounts) {
            numberOfStudents += counter;
        }
        return numberOfStudents;
    }
}