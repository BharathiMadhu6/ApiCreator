package com.BharathiMadhu.ApiCreator.Student;

import java.time.LocalDate;

public class Student {
    private String name;
    private int id;
    private String emailId;
    private LocalDate dob;
    private int age;

    public Student() {}

    public Student(String name, int id, String emailId,
                   LocalDate dob, int age) {
        this.name = name;
        this.id = id;
        this.emailId = emailId;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, String emailId, LocalDate date, int age) {
        this.name = name;
        this.emailId = emailId;
        this.dob = date;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmailId() {
        return emailId;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", emailId='" + emailId + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
