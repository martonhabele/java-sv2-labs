package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("András", 2005, 250000);
        System.out.println(employee.toString());

        employee.raiseSalary(50000);
        employee.setName("Béla");
        System.out.println(employee.toString());
    }
}