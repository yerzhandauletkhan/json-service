//package myproject;
package org.example;
import myproject.domain.Employee;
import myproject.domain.Department;
import myproject.service.EmployeeService;
import myproject.service.ServiceFactory;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = ServiceFactory.createEmployeeService();

        Department dep = new Department("IT");
        Employee emp = new Employee("John Doe", "Developer", dep);

        employeeService.addEmployee(emp);

        employeeService.getAllEmployees().forEach(employee -> {
            System.out.println("Employee: " + employee.getName() + ", Position: " + employee.getPosition());
        });
    }
}