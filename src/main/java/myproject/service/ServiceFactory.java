

package myproject.service;

public class ServiceFactory {
    public static EmployeeService createEmployeeService() {
        return new EmployeeServiceImpl();
    }
}