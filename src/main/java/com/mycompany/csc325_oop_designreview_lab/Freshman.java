package com.mycompany.csc325_oop_designreview_lab;

/**
 * Freshman class extends Student
 */
public class Freshman extends Student {

    public Freshman(String name, int age, int credits) {
        super(name, age, credits);
    }

    @Override
    public String toString() {
        return "Freshman -> " + super.toString();
    }
}

