package com.school;

public class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getter method
    public String getDetails() {
        return "Student[ID=" + id + ", Name=" + name + ", Age=" + age + "]";
    }
}
