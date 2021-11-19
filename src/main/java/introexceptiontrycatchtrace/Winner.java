package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {
    private List<String> names = new ArrayList<>(Arrays.asList("John", "Jack", "Jane", null));

    public void addPerson(String name) {
        names.add(name);
    }

    public String getWinner() {
        Random random = new Random();
        int winner = random.nextInt(names.size());
        return names.get(winner).toUpperCase();
    }

    public List<String> getNames() {
        return names;
    }
}