package com.capg;

public class Exr1Solution {

	public static void main(String[] args) {
		Account smith = new Account();
	    Account kathy = new Account();
	    
	    smith.setName("Smith");
	    smith.setAge(25);
	    smith.setBalance(2000);
	    smith.setAccNum(12345);

	    kathy.setName("Kathy");
	    kathy.setAge(29);
	    kathy.setBalance(3000);
	    kathy.setAccNum(67890);

	    smith.deposit(2000);
	    kathy.withdraw(2000);
	    System.out.println("Smith has: " + smith.getBalance());
	    System.out.println("Kathy has: " + kathy.getBalance());

	}

}
