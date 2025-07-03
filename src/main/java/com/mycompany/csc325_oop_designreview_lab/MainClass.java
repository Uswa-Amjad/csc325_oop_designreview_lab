package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// Creating Freshman and Senior objects
		Freshman std1 = new Freshman("James", 20, 12); // name, age, credits
		Senior std2 = new Senior("John", 30, 90);      // name, age, credits

		// Set GPA using scanner
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter GPA for Freshman James: ");
		double gpa1 = scanner.nextDouble();
		std1.setGpa(gpa1);

		System.out.print("Enter GPA for Senior John: ");
		double gpa2 = scanner.nextDouble();
		std2.setGpa(gpa2);

		// Print info using toString (polymorphism)
		System.out.println(std1);
		System.out.println(std2);

		scanner.close();
	}
}


