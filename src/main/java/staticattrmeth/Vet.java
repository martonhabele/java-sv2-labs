package staticattrmeth;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    private List<Dog> dogList = new ArrayList<>();
    private static long code = 1;

    public void addDog(Dog dog) {
        dog.setCodeNumber(code);
        dogList.add(dog);
        code++;
    }

    public List<Dog> getDogList() {
        return dogList;
    }
}