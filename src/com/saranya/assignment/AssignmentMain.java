package com.saranya.assignment;

import com.saranya.assignment.employees.Developer;
import com.saranya.assignment.employees.Manager;
import com.saranya.assignment.utilities.EmployeeUtilities;


public class AssignmentMain {
    public static void main(String[] args) {
       
        
        Manager manager = new Manager("david", 101, 75000, "HR");

      
        Developer developer = new Developer("sarah", 102, 60000, "Java");

        
        System.out.println("=== Manager Details ===");
        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());

        
        System.out.println("\n=== Developer Details ===");
        EmployeeUtilities.printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

        
        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 15);
    }
}
