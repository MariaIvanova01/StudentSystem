package com.company;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toPrintStudentsInfo() {

        String toPrint = String.format("%s is %d years old.",name, age);

        double studentGrade = grade;

        if (studentGrade >= 5.00) {
            toPrint += " Excellent student.";
        } else if (studentGrade < 5.00 && studentGrade >= 3.50) {
            toPrint += " Average student.";
        } else {
            toPrint += " Very nice person.";
        }

        return toPrint;

    }
}
