package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student first = new Student("Béla");
        Student second = new Student("Géza");
        Student third = new Student("András");
        Student fourth = new Student("Endre");
        Student fifth = new Student("Zoltán");

        students.add(first);
        students.add(second);
        students.add(third);
        students.add(fourth);
        students.add(fifth);

        System.out.println(students.size());

        second.setActive(false);
        third.setActive(false);
        fifth.setActive(false);

        List<Student> purgeinactives = new ArrayList<>();
        for (Student student: students) {
            if (!student.isActive()) {
                purgeinactives.add(student);
            }
        }
        students.removeAll(purgeinactives);
        System.out.println(students.size());
    }
}