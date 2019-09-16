package com.example.filecabinet;

import java.io.Serializable;

public class Student implements Serializable {

    public String firstName;
    public String secondName;
    public String gender;
    public String specialization;
    public int number;

    public Student(int number, String firstName, String secondName, String gender, String specialization) {
        this.number = number;
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.specialization = specialization;
    }
}
