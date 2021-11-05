package stringbasic;

public class UniversityMain {
    public static void main(String[] args) {
        Student student = new Student(new Person("Béla", "xyz", "123456", "123", "456"), "123", "456");
        Student student1 = new Student(new Person("Béla", "xyz", "123456", "123", "456"), "123", "456");
        University university = new University();

        System.out.println(university.areEqual(student, student1));
    }
}