package com.capg.exception;

import java.util.Scanner;

public class NameValidation {
	
	static void validate(String firstName, String lastName) throws InvalidName {
		if (firstName.isEmpty() && lastName.isEmpty())
			throw new InvalidName ("Name can not be null.");
	    else if (firstName.isEmpty())
	        throw new InvalidName ("First Name can not be null.");
	    else if (lastName.isEmpty())
	        throw new InvalidName ("Last Name can not be null.");
	    else
	        System.out.println("Hello user! " + firstName + " " + lastName);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter first name: ");
	    String f = sc.nextLine();
	    System.out.print("Enter last name: ");
	    String l = sc.nextLine();
	    try { 
	    	validate(f, l); 
	    }
	    catch (Exception e) { 
	    	System.out.println("Exception occurred! " + e); 
	    }
	    sc.close();
	}

}
