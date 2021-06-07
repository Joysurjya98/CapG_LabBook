package com.capgemini.lab9;

public class Exercise5 {

	public static int calculateFactorial(int n) {
		int result = 1;
		for(int i=1; i<=n; i++) {
			result = result * i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Factorial f = Exercise5::calculateFactorial;
		System.out.println(f.test(5));

	}

}
