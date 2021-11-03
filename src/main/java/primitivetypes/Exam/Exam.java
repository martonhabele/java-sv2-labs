package primitivetypes.Exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    List<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }
}