package introinheritance.coffee;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Simple Black");
        coffee.setPrice(650);
        System.out.println(coffee.getName() + " " + coffee.getPrice() + "Ft");

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Light");
        cappuccino.setPrice(750);
        System.out.println(cappuccino.getName() + " " + cappuccino.getPrice() + "Ft");
    }
}