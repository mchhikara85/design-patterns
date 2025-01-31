package main.java.creational.builder;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String college;

    public Student(String name, int age, String gender, String college) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.college = college;
    }

    @Override
    public String toString() {
        return name + "\n" + age + "\n" + gender + "\n" + college + "\n";
    }
}
