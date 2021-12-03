package methodpass.troopers;

public class Position {
    private double xCoordinate;
    private double yCoordinate;

    public Position(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double distanceFrom(Position position) {
        try {
            return Math.sqrt(Math.pow(xCoordinate - position.xCoordinate, 2) + Math.pow(yCoordinate - position.yCoordinate, 2));
        } catch (IllegalArgumentException iae) {
            throw new IllegalStateException("No valid coordinates!" + iae);
        }
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }
}