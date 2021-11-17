package introexceptionmoreexceptions;

public class Person {
    private String name;
    private int age;

    public static void main(String[] args) {
        Person person = new Person(null, 32);
        System.out.println(person);
        System.out.println(person.getName().toUpperCase()); //nullpointer exception, mert null értékű változón hívtam meg a toUpperCase metódust
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
