package com.capg;

public class WrittenItem extends Item {
	private String author;

	// Constructors
	WrittenItem(int id, String title, int num, String author) {
      super(id, title, num);
      this.author = author;
    }

	// Setters
    public void setAuthor(String ath) { 
	  this.author = ath;
	}

    // Getters
    public String getAuthor() { 
    	return author;
    }
    public int getIdentificationNumber() {
    	return super.getIdentificationNumber(); 
    }

}
