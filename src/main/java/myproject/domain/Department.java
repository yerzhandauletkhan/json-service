package myproject.domain;

public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    // Геттеры и сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}