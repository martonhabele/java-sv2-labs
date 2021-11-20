package introexceptionthrow;

public class Validation {
    public void validateName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name is not valid!");
        }
    }

    public void validateAge(String age) {
        char[] ageChars = age.toCharArray();
        int ageInteger = Integer.parseInt(age);
        for (char ageChar : ageChars) {
            if (!Character.isDigit(ageChar) || age.isBlank()) {
                throw new IllegalArgumentException("Not a valid age!");
            }
        }
        if (ageInteger > 120) {
            throw new IllegalArgumentException("Must be younger than 120 years old!");
        }
        else if (ageInteger < 1) {
            throw new IllegalArgumentException("Must be at least 1 year old!");
        }
    }
}