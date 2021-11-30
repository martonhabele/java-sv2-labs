package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {
    private List<Person> personList;

    public PrimarySchool(List<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (Person scopedPerson : personList) {
            if (scopedPerson.getAge() >= 6 && scopedPerson.getAge() <= 14) {
                Student student = new Student(scopedPerson.getName(), scopedPerson.getAddress());
                students.add(student);
            }
        }
        return students;
    }

    public List<Person> getPersonList() {
        return personList;
    }
}