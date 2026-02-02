package org.example;

public class Teacher extends Person {
    private String subject;


    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }


    @Override
    public void introduce(){
        System.out.println("My name is " + name + ", and I am a teacher that teaches " + subject);
    }
}
