package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person = new Person("Béla", 30);
        Person newPerson = person;
        System.out.println(person.getName());
        System.out.println(newPerson.getName());

        newPerson.setName("Gizi");
        System.out.println(person.getName());
        System.out.println(newPerson.getName());

        int a = 24;
        int b = a;
        b++;
        System.out.println("a: " + a + "; b: " + b);

        newPerson = new Person("Éva", 25);
        System.out.println(person.getName());
        System.out.println(newPerson.getName());
    }
}