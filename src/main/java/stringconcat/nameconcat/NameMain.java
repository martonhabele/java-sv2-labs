package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        Name name = new Name("John", "James", "Doe", Title.MD);
        System.out.println(name.concatNameWesternStyle());
        System.out.println(name.concatNameHungarianStyle());
    }
}