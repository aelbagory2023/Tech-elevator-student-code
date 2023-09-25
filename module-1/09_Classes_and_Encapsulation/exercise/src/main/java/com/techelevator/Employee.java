package com.techelevator;

public class Employee {
    public int employeeId;
    public String firstName;
    public String lastName;
    public String fullName;
    public String department;
    public double annualSalary;

    public Employee(int employeeId, String firstName,String lastName, double annualSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.annualSalary = annualSalary;
        fullName = lastName + ", " + firstName;

    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFullName() {
        return fullName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public void raiseSalary(double percent) {
        double newSalary = annualSalary + ((percent/100) * annualSalary);
        System.out.println(annualSalary);
        System.out.println(newSalary);
        System.out.println(percent);
        annualSalary = newSalary;

    }

}
