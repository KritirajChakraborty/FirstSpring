package com.Kritiraj.hello_spring;

public class Student {

    private int admissionID;

    private String name;

    private int age;

    private String email;

    public Student() {
    }

    public Student(int admissionID, String name, int age, String email) {
        this.admissionID = admissionID;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getAdmissionID() {
        return admissionID;
    }

    public void setAdmissionID(int admissionID) {
        this.admissionID = admissionID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
