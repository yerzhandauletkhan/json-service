package myproject.domain;

public class Position {
    private String title;

    public Position(String title) {
        this.title = title;
    }

    // Геттеры и сеттеры
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
}