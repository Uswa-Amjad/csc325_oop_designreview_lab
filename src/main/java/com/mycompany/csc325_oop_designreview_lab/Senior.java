package com.mycompany.csc325_oop_designreview_lab;

/**
 * Senior class with at least 85 credits
 */
public class Senior extends Student {

    public Senior(String name, int age, int credits) {
        super(name, age, credits);
        if (credits < 85) {
            throw new IllegalArgumentException("Senior must have at least 85 credits");
        }
    }

    @Override
    public String toString() {
        return "Senior -> " + super.toString();
    }
}
