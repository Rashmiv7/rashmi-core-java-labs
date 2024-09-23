package com.deloitte.lab4.ex3;

	public class JournalPaper extends WrittenItem {
	    private int yearPublished;

	    public JournalPaper(String id, String title, int copies, String author, int yearPublished) {
	        super(id, title, copies, author);
	        this.yearPublished = yearPublished;
	    }

	    public int getYearPublished() {
	        return yearPublished;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Year Published: " + yearPublished;
	    }
	}



