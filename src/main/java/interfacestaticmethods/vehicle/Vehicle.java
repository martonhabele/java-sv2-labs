package interfacestaticmethods.vehicle;

public interface Vehicle {
    static Vehicle of(int numberOfWheels) {
        if (numberOfWheels == 2) {
            return new Bicycle(2);
        } else if (numberOfWheels == 4) {
            return new Car(numberOfWheels);
        } else {
            throw new IllegalArgumentException("Only bicycle or car is allowed!");
        }
    }
}