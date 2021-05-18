package com.capg;

public abstract class Item {
	private int identificationNumber;
    private String title;
    private int numberOfCopies;

    //  Constructors
    Item(int id, String t, int noC) {
        this.identificationNumber = id;
        this.title = t;
        this.numberOfCopies = noC;
    }

    //  Getters
    public int getIdentificationNumber() { 
    	return identificationNumber; 
    }
    public String getTitle() { 
    	return title;
    }
    public int getNumberOfCopies() { 
    	return numberOfCopies;
    }

    //  Setters
    public void setIdentificationNumber(int id) { 
    	this.identificationNumber = id; 
    }
    public void setTitle(String s) { 
    	this.title = s;
    }
    public void setNumberOfCopies(int num) { 
    	this.numberOfCopies = num;
    }

    //  Methods
    public void addItems() { 
    	numberOfCopies += 1;
    }
    public void checkIn() { 
    	numberOfCopies += 1; 
    }
    public void checkOut() { 
    	numberOfCopies -= 1; 
    }
    public void print() { 
    	System.out.println("Identification number: " + identificationNumber + "\nTitle: " + title + "\nNumber of copies: " + numberOfCopies); 
    }

}
