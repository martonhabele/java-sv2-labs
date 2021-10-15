package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();                     //Creating instance for note
        Scanner scanner = new Scanner(System.in);   //Creating instance for console input

        System.out.print("Name: ");
        note.setName(scanner.nextLine());
        System.out.print("Topic: ");
        note.setTopic(scanner.nextLine());
        System.out.println("Text:");
        note.setText(scanner.nextLine());

        System.out.println(note.getNoteText());     //Using the custom-made getter from Note.java
    }
}
