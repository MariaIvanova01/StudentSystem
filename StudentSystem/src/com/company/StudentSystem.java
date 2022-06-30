package com.company;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentsInfo;

    public StudentSystem() {
        this.studentsInfo = new HashMap<>();
    }

    public Map<String, Student> getStudentsInfo() {
        return this.studentsInfo;
    }

    public void ParseCommand(String[] commands) {
        String commandName = commands[0];
        String name = commands[1];

        if (commandName.equals("Create")) {
            int age = Integer.parseInt(commands[2]);
            double grade = Double.parseDouble(commands[3]);
            if (!studentsInfo.containsKey(name)) {
                Student student = new Student(name, age, grade);
                studentsInfo.put(name, student);
            }
        } else if (commandName.equals("Show")) {
            Student student = studentsInfo.get(name);

            if (student != null) {
                System.out.println(student.toPrintStudentsInfo());
            }

        }else{
            throw new IllegalArgumentException("Unknown command " + commandName);
        }
    }
}
