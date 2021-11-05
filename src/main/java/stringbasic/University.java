package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent) {
        String s1NeptunCode = student.getNeptunCode();
        String s2NeptunCode = anotherStudent.getNeptunCode();
        String s1EduId = student.getEduId();
        String s2EduId = anotherStudent.getEduId();
        return s1NeptunCode.equals(s2NeptunCode) && s1EduId.equals(s2EduId);
    }

    public List<Student> getStudents() {
        return students;
    }
}