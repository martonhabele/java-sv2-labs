package introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("Dinnye");
        fruit.setWeight(2.5d);
        System.out.println(fruit.getName());

        Grape grape = new Grape();
        grape.setType("Vörös");
        System.out.println(grape.getWeight());

        Apple apple = new Apple();
        apple.setPieces(3);
        System.out.println(apple.getPieces());

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        System.out.println(goldenDelicious.getPieces());

        Starking starking = new Starking();
        System.out.println(starking.getClass());
    }
}