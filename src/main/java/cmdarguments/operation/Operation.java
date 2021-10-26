package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
        for (String command: args) {
            if (command.equals("/list")) System.out.println("Listázás");
            else if (command.equals("/add")) System.out.println("Hozzáadás");
            else if (command.equals("/delete")) System.out.println("Törlés");
            else System.out.println("Ismeretlen művelet");
        }
    }
}