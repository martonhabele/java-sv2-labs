package stringbuilder;

public class PalindromeValidator {
    public static void main(String[] args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator();
        System.out.println(palindromeValidator.isPalindrome("ABBA"));
        System.out.println(palindromeValidator.isPalindrome("BABA"));
    }

    public boolean isPalindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        return word.equalsIgnoreCase(stringBuilder.reverse().toString());
    }
}