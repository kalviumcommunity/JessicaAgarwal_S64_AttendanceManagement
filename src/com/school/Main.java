package com.school;

public class Main {
    public static void main(String[] args) {
        // Array of Students
        Student[] students = {
                new Student(1, "Alice", 20),
                new Student(2, "Bob", 21),
                new Student(3, "Charlie", 22)
        };

        // Array of Courses
        Course[] courses = {
                new Course(101, "Mathematics", 3),
                new Course(102, "Computer Science", 4),
                new Course(103, "English Literature", 2)
        };

        System.out.println("=== Students ===");
        for (Student s : students) {
            System.out.println(s.getDetails());
        }

        System.out.println("\n=== Courses ===");
        for (Course c : courses) {
            System.out.println(c.getDetails());
        }
    }
}