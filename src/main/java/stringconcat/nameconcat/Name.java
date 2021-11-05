package stringconcat.nameconcat;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    private Title title;

    public Name(String firstName, String middleName, String lastName, Title title) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.title = title;
    }

    public String concatNameWesternStyle() {
        String returnedName;
        returnedName = firstName;
        if (!middleName.isEmpty()) {
            returnedName = returnedName + " " + middleName;
        }

        returnedName = returnedName + " " + lastName;

        if (title != null) {
            returnedName = returnedName + ", " + title;
        }
        return returnedName;
    }

    public String concatNameHungarianStyle() {
        String returnedNameHun = "";
        if (title != null) {
            returnedNameHun = title.getTitle();
            returnedNameHun = returnedNameHun.concat(" ");
        }

        returnedNameHun = returnedNameHun.concat(lastName);
        returnedNameHun = returnedNameHun.concat(" ");
        returnedNameHun = returnedNameHun.concat(firstName);

        if (!middleName.isEmpty()) {
            returnedNameHun = returnedNameHun.concat(" ");
            returnedNameHun = returnedNameHun.concat(middleName);
        }
        return returnedNameHun;
    }
}