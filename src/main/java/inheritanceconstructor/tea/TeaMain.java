package inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea("Earl Grey", 500);
        HerbalTea herbalTea = new HerbalTea("Black", 600);

        System.out.println(tea.getName() + " " + tea.getPrice());
        System.out.println(herbalTea.getName() + " " + herbalTea.getPrice());
    }
}