package streamsalgorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String employeeName;
    private int yoB;

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Smith", 1975));
        employees.add(new Employee("Jack Doe", 1976));
        employees.add(new Employee("John Smith", 1981));
        employees.add(new Employee("Jane Robertson", 1983));
        employees.add(new Employee("Will Black", 1993));
        employees.add(new Employee("Dana White", 1988));
        employees.add(new Employee("Bill Whitaker", 1981));
        employees.add(new Employee("Susan Boyle", 1994));

        int sumOfYoB = employees
                .stream()
                .mapToInt(Employee::getYoB)
                .sum();
        System.out.println(sumOfYoB);

        int sumOfAge = employees
                .stream()
                .mapToInt(Employee::getYoB)
                .map(n -> 2022 - n)
                .sum();
        System.out.println(sumOfAge);

        int countOfEmployees = (int) employees
                .stream()
                .count();
        System.out.println(countOfEmployees);

        int youngsters = (int) employees
                .stream()
                .filter(employee -> employee.getYoB() < 1990)
                .count();
        System.out.println(youngsters);

        int earliestYoB = employees
                .stream()
                .mapToInt(value -> value.getYoB())
                .min()
                .orElseThrow(() -> new IllegalArgumentException("No value!"));
        System.out.println(earliestYoB);

        String oldestName = employees
                .stream()
                .sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.getYoB() - o2.getYoB();
                    }
                })
                .map(employee -> employee.getEmployeeName())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No value!"));
        System.out.println(oldestName);

        boolean olderThanTheEighties = employees.stream().allMatch(employee -> employee.getYoB() < 1980);
        System.out.println(olderThanTheEighties);

        System.out.println(employees
                .stream()
                .filter( e -> e.getYoB() < 1990)
                .map(Employee::getEmployeeName)
                .collect(Collectors.toList()));

        System.out.println(employees.stream().map(Employee::getEmployeeName).collect(Collectors.toList()));
    }

    public Employee(String employeeName, int yoB) {
        this.employeeName = employeeName;
        this.yoB = yoB;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getYoB() {
        return yoB;
    }
}