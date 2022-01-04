package interfacerules.commonproperties;

public class IkeaFurniture implements Name, Width, Length {
    private String name;
    private double length;
    private double width;

    public IkeaFurniture(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}