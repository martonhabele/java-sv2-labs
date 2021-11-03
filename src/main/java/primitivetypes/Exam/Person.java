package primitivetypes.Exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate doB;
    private int zipCode;
    private double avgGrade;

    public Person(String name, LocalDate doB, int zipCode, double avgGrade) {
        this.name = name;
        this.doB = doB;
        this.zipCode = zipCode;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", doB=" + doB +
                ", zipCode=" + zipCode +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public LocalDate getDoB() {
        return doB;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getAvgGrade() {
        return avgGrade;
    }
}