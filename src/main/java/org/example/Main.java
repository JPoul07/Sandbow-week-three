package org.example;

import static org.example.MathUtil.multi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person jerry = new Person("Jerry", 7);
        Student nolan = new Student("Nolan", 32, "108522454855", "Computer Science");
        Student logan = new Student("Logan", 52, "15233", "Dance");
        Teacher jeremy = new Teacher("Jeremy", 25, "Music");
        TeachingAssistant pascal = new TeachingAssistant("Pascal", 23);
        Person[] people = {jerry, nolan, logan, jeremy, pascal};

        for (Person element : people) {
            element.introduce();
        }

        multi(5,3);
        multi(5,3,6);
        multi(5.5,5.5);
        multi(6.8,3.2,6.37);

    }
}