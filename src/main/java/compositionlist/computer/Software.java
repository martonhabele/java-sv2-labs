package compositionlist.computer;

public class Software {
    private String name;
    private String numberOfVersion;

    public Software(String name, String numberOfVersion) {
        this.name = name;
        this.numberOfVersion = numberOfVersion;
    }

    @Override
    public String toString() {
        return "Software{" +
                "name='" + name + '\'' +
                ", numberOfVersion='" + numberOfVersion + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfVersion() {
        return numberOfVersion;
    }

    public void setNumberOfVersion(String numberOfVersion) {
        this.numberOfVersion = numberOfVersion;
    }
}