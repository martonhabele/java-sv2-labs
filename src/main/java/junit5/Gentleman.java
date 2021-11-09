package junit5;

public class Gentleman {
    private String name;

    public Gentleman(String name) {
        this.name = name;
    }

    public String sayHello(String name) {
        if (name == null) {
            return "Hello Anonymous";
        }
        return "Hello " + name;
    }

    public String getName() {
        return name;
    }
}