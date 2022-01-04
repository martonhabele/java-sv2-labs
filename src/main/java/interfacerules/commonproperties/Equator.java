package interfacerules.commonproperties;

public class Equator implements Name, Length {
    private static final String NAME = "Equator";
    private static final double LENGTH = 40_075d;

    @Override
    public double getLength() {
        return LENGTH;
    }

    @Override
    public String getName() {
        return NAME;
    }
}