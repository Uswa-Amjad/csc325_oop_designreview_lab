package com.mycompany.csc325_oop_designreview_lab;

public class Student extends Human {

    private double gpa;
    private int credits;
    private String address;

    public Student(String name, int age, int credits) {
        super(name, (short) age); // matches Human(String, short)
        this.credits = credits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student Name: " + getName() + ", Age: " + getAge() +
                ", Credits: " + credits + ", GPA: " + gpa;
    }
}

