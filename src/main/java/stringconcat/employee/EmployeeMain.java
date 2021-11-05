package stringconcat.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Tamás", "elektrikus", 300_000);

        System.out.println(employee.toString());
    }
}