package myproject.service;

import myproject.domain.Department;
import myproject.domain.Employee;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class EmployeeServiceTest {

    private EmployeeService employeeService;

    @Before
    public void setUp() {
        employeeService = ServiceFactory.createEmployeeService();
    }

    @Test
    public void testAddEmployee() {
        Department dep = new Department("IT");
        Employee emp = new Employee("John Doe", "Developer", dep);

        employeeService.addEmployee(emp);
        List<Employee> employees = employeeService.getAllEmployees();

        assertEquals(1, employees.size());
        assertEquals("John Doe", employees.get(0).getName());
    }

    @Test
    public void testGetAllEmployees() {
        Department dep1 = new Department("IT");
        Department dep2 = new Department("HR");

        Employee emp1 = new Employee("John Doe", "Developer", dep1);
        Employee emp2 = new Employee("Jane Smith", "HR Manager", dep2);

        employeeService.addEmployee(emp1);
        employeeService.addEmployee(emp2);

        List<Employee> employees = employeeService.getAllEmployees();

        assertEquals(2, employees.size());
        assertEquals("John Doe", employees.get(0).getName());
        assertEquals("Jane Smith", employees.get(1).getName());
    }
}