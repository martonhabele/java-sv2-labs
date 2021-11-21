package introexceptionthrow.patient;

public class Patient {
    private static final int MIN_YEAR = 1900;
    private String name;
    private String ssn;
    private int yoB;

    public static void main(String[] args) {
        Patient patient = new Patient("Jack", "123456788", 1980);
        System.out.println(patient.toString());
        Patient patient1 = new Patient("John", "0", 1975);
        System.out.println(patient1.toString());
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", yoB=" + yoB +
                '}';
    }

    public Patient(String name, String ssn, int yoB) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty!");
        }
        char[] nameChars = name.toCharArray();
        for (char nameChar : nameChars) {
            if (!Character.isLetter(nameChar)) {
                throw new IllegalArgumentException("Name is invalid!");
            }
        }
        if (!new SsnValidator().isValidSsn(ssn)) {
            throw new IllegalArgumentException("Invalid SSN!");
        }
        if (yoB < MIN_YEAR) {
            throw new IllegalArgumentException("YoB is invalid!");
        }
        this.name = name;
        this.ssn = ssn;
        this.yoB = yoB;
    }
}