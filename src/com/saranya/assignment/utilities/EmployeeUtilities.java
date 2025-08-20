package com.saranya.assignment.utilities;

import com.saranya.assignment.employees.Employee;
public class EmployeeUtilities {

    
    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }

   
     
    public static void increaseSalary(Employee emp, double percent) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percent / 100);
        emp.setSalary(newSalary);
        System.out.println(emp.getName() + "'s new salary after " + percent + "% increment: " + emp.getSalary());
    }
}
