package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Fish fish = new Fish("csíkos", "fehér");
        Fish fish1 = new Fish("sima", "kék");
        Fish fish2 = new Fish("tüskés", "sárga");

        aquarium.addFish(fish);
        aquarium.addFish(fish1);
        aquarium.addFish(fish2);

        System.out.println(aquarium.getNumberOfFish());     //A hiba az Aquarium osztályban van leírva
    }
}