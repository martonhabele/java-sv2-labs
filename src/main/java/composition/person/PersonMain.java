package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Géza", "xyz", new Address("USA", "Boston", "James ST", "MA1234"));

        System.out.println(person.getAddress().addressToString());
        System.out.println(person.personToString());
    }
}