package introexceptionthrow.patient;

public class Patient {
    private static final int MIN_YEAR = 1900;
    private String name;
    private String ssn;
    private int yoB;

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
        if (yoB < MIN_YEAR) {
            throw new IllegalArgumentException("YoB is invalid!");
        }
        this.name = name;
        this.ssn = ssn;
        this.yoB = yoB;
    }
}