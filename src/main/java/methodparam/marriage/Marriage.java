package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {
    public void getMarried(Woman woman, Man man) {
        setMarriedWomansName(woman, man.getName());
        addRegisterDate(woman, man);
    }

    public void setMarriedWomansName(Woman woman, String name) {
        String[] names = name.split(" ");
        String husbandsLastName = names[0];
        woman.setName(husbandsLastName + " - " + woman.getName());
    }

    public void addRegisterDate(Woman woman, Man man) {
        woman.addRegisterDate(new RegisterDate("marriage's date", LocalDate.now()));
        man.addRegisterDate(new RegisterDate("marriage's date", LocalDate.now()));
    }
}