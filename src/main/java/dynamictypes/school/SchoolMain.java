package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("A szimpla school", 6);
        School school1 = new PrimarySchool("Áltsuli", 8);
        School school2 = new SecondarySchool("Középsuli", 4);

        System.out.println(school.toString());
        System.out.println(school1.toString());
        System.out.println(school2.toString());
    }
}