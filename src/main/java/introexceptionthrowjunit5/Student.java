package introexceptionthrowjunit5;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Integer> notes = new ArrayList<>();

    public void addNote(int note) {
        if (note < 1 || note > 5) {
            throw new IllegalArgumentException("Invalid grade!");
        }
        notes.add(note);
    }

    public List<Integer> getNotes() {
        return notes;
    }
}