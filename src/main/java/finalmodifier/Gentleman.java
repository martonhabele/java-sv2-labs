package finalmodifier;

public class Gentleman {
    public static final String MESSAGE_PREFIX = "Welcome";
    public static void main(String[] args) {
        System.out.println(new Gentleman().sayHello("András"));
    }

    public String sayHello(String name) {
        return MESSAGE_PREFIX + " " + name + "!";
    }
}