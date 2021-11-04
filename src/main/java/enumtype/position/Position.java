package enumtype.position;

public enum Position {
    IRODAI_DOLGOZÓ(200_000, "bérlet, telefon"), OSZTÁLYVEZETŐ(350_000, "laptop"), FŐOSZTÁLYVEZETŐ(500_000, "autó"), IGAZGATÓ(1_000_000, "magánrepülő");

    private int Salary;
    private String benefit;

    Position(int salary, String benefit) {
        Salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return Salary;
    }

    public String getBenefit() {
        return benefit;
    }
}