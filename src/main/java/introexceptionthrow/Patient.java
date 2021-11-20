package introexceptionthrow;

public class Patient {
    private static final int EARLIEST_YEAR = 1900;
    private String name;
    private String ssn;
    private int yoB;

    public static void main(String[] args) {
        Patient patient = new Patient("John", "123", 1901);
        System.out.println(patient.toString());
        Patient patient1 = new Patient("", "456", 1901);
        System.out.println(patient1.toString());
        Patient patient2 = new Patient("Jack", "789", 1900);
        System.out.println(patient2.toString());
    }

    public Patient(String name, String ssn, int yoB) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty!");
        }
        if (yoB <= EARLIEST_YEAR) {
            throw new IllegalArgumentException("Invalid YoB!");
        }
        this.name = name;
        this.ssn = ssn;
        this.yoB = yoB;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", yoB=" + yoB +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public int getYoB() {
        return yoB;
    }
}