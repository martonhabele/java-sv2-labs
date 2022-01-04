package interfacerules.commonproperties;

public class ParkingPlace implements Length, Width {
    @Override
    public double getLength() {
        return 5d;
    }

    @Override
    public double getWidth() {
        return 2.2d;
    }
}