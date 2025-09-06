package com.school;

public class Course {
    private int id;
    private String title;
    private int credits;

    // Constructor
    public Course(int id, String title, int credits) {
        this.id = id;
        this.title = title;
        this.credits = credits;
    }

    // Getter method
    public String getDetails() {
        return "Course[ID=" + id + ", Title=" + title + ", Credits=" + credits + "]";
    }
}
