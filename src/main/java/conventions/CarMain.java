package conventions;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car("Ford", "petrol", 5, 5);

        System.out.println(car.getCarType() + " has " + car.getdoors() + " doors for " + car.getPersons() + " persons");
        System.out.println("And it uses " + car.GetEngineType() + " engine");

        car.addModelName("Focus");

        System.out.println("And this model is the... " + car.getCarType());
    }
}
