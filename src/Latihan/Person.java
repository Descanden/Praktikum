package Latihan;

public class Person {
    protected String employeeName;
    protected int employeeAge;
    protected double salary;
    protected String jobDescription;

    public Person(String empName, int employeeAge, double salary, String jobDescription) {
        employeeName = empName;
        this.employeeAge = employeeAge;
        this.salary = salary;
        this.jobDescription = jobDescription;
    }
}
