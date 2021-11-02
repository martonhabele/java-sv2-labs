package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer(new Cpu("AMD Ryzen", 3.2d));

        pc.addHardware(new Hardware("Printer", "HP Deskjet"));
        pc.addSoftware(new Software("Windows", "10"));

        System.out.println(pc.getHardwares().toString());
        System.out.println(pc.toString());
    }
}