package stringtype.registration;

public class UserValidator {

//    I don't want to be disrespectful, but I don't see the point to use ternary operators in here!

    public boolean isValidUsername(String username) {
        return !username.equals("");
    }

    public boolean isValidPassword(String password1, String password2) {
        return (password1.length()) >= 8 && password1.equals(password2);
    }

    public boolean isValidEmail(String email) {
        return email.indexOf("@") > 0 && email.indexOf(".") < email.length() - 1;
    }
}