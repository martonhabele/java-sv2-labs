package introexceptionthrow.patient;

public class SsnValidator {
    public boolean isValidSsn(String ssn) {
        if (ssn.length() != 9) {
            return false;
        }
        try {
            int ssnSum = 0;
            for (int i = 0; i < ssn.length(); i += 2) {
                ssnSum += charConverterAndChecker(ssn.charAt(i)) * 3;
            }
            for (int i = 1; i < ssn.length(); i += 2) {
                ssnSum += charConverterAndChecker(ssn.charAt(i)) * 7;
            }
            return (ssnSum % 10) == (charConverterAndChecker(ssn.charAt(8)));
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            return false;
        }
    }

    public int charConverterAndChecker(char ssnLetters) {
        if (!Character.isDigit(ssnLetters)) {
            throw new IllegalArgumentException("SSN should contain numbers only!");
        }
        return Integer.parseInt(String.valueOf(ssnLetters));
    }
}