package com.capg.exception;

import java.util.Scanner;

public class AgeValidation {
	
	static void validate(int age) throws InvalidAge {
        if (age < 15)
            throw new InvalidAge("Invalid Input. Age must be greater than 15.");
        else
            System.out.println("Welcome user! Age is valid.");
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
        	validate(age);
        }
        catch (Exception e) {
        	System.out.println("Exception occurred. " + e); 
        }
        sc.close();
		
	}

}
