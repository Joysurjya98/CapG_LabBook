package com.capg;

public class Exr3Solution {

	public static void main(String[] args) {
		Book b = new Book(1234, "The Nightingale", 5, "Hannah Kristin");
	    b.addItems();
	    b.print();
	    System.out.println("After checkout, number of copies left: ");
	    b.checkOut();
	    b.print();
	    System.out.println("After adding one element, number of copies left: ");
	    b.addItems();
	    b.print();

	    System.out.println();

	    Video v = new Video(4567, "Skyfall", 3, 143, "Sam Mendes", "Crime/Thriller", 2012);
	    v.addItems();
	    v.print();
	    System.out.println("After checking in, number of copies left: ");
	    v.checkIn();
	    v.print();

	    System.out.println();

	    CD c = new CD(1090, "Hybrid Theory", 2, 38, "Linkin Park", "Rock");
	    c.addItems();
	    c.print();
	    System.out.println("After checking out, number of copies left: ");
	    c.checkOut();
	    c.print();

	}

}
