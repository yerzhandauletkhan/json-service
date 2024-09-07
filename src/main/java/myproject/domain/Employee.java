package myproject.domain;

public class Employee {
    private String name;
    private String position;
    private Department department;

    public Employee(String name, String position, Department department) {
        this.name = name;
        this.position = position;
        this.department = department;
    }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
}