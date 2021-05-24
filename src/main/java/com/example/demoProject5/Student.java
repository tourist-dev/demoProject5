package com.example.demoProject5;

import java.util.Vector;

public class Student {
    int id;
    String name;
    String classroom;

    public Student(int id, String name, String classroom) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
    }
}

class StudentDatabase {
    static Vector<Student> students = new Vector<>();
}
