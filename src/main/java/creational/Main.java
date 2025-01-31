package main.java.creational;

import main.java.creational.builder.Student;
import main.java.creational.builder.StudentBuilder;

public class Main {

    public static void main(String[] args) {
        Student student = new StudentBuilder()
                .name("Abhimanyu")
                .age(8)
                .gender("Male")
                .college("Greensboro Academy")
                .build();

        System.out.println(student);
    }
}
