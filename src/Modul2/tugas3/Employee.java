package Modul2.tugas3;

import Modul2.tugas3.EmployeeInterface;
import Modul2.tugas3.Person;

public class Employee extends Person implements EmployeeInterface {

    public Employee(EmployeeInfo employeeInfo){
        super(employeeInfo.getEmployeeName(), employeeInfo.getEmployeeAge(), employeeInfo.getSalary(), employeeInfo.getJobDescription());
    }

        @Override
        public void printEmployeeInfo() {
            System.out.println("Emplpyee Name: " + employeeName);
            System.out.println("Age: " + employeeAge);
            System.out.println("Salary: $" + salary);
            System.out.println(("Job Description: " + jobDescription));
        }

        @Override
        public double calculateAnnualSalary() {
            return salary * 12;
        }

        @Override
        public void applyRaise(double raisePercentage) {
            salary += (salary * raisePercentage / 100);
        }

    private static class EmployeeInfo {
        private final String employeeName;
        private final int employeeAge;
        private final double salary;
        private final String jobDescription;

        private EmployeeInfo(String employeeName, int employeeAge, double salary, String jobDescription) {
            this.employeeName = employeeName;
            this.employeeAge = employeeAge;
            this.salary = salary;
            this.jobDescription = jobDescription;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public int getEmployeeAge() {
            return employeeAge;
        }

        public double getSalary() {
            return salary;
        }

        public String getJobDescription() {
            return jobDescription;
        }
    }
}

