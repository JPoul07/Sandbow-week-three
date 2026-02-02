package org.example;

public class Student extends Person {
    private String studentId;
    private String major;

    public Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    public void study() {
        System.out.println(this.name + " (ID: " + studentId + ") is studying.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm a student called " + this.name + ", (ID: " + studentId + ") and I am " + age + ". and I am majoring in " + major);
    }
}
