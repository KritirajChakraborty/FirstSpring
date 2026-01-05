package com.Kritiraj.hello_spring;

public class Teacher {

    private int ID;
    private String name;
    private int age;
    private String email;
    private int noOfStudents;

    public Teacher() {
    }

    public Teacher(int ID, String name, int age, String email) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.email = email;
        this.noOfStudents = 0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }
}
