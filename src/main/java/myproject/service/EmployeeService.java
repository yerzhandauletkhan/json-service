package myproject.service;

import myproject.domain.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    List<Employee> getAllEmployees();
}