package com.deloitte.lab4.ex3;
import java.util.ArrayList;

public class Lab4Ex3 {
	
	    public static void main(String[] args) {
	        ArrayList<Item> libraryItems = new ArrayList<>();

	       
	        Book book1 = new Book("B001", "Effective Java", 5, "Joshua Bloch");
	        JournalPaper journal1 = new JournalPaper("JP001", "AI Research", 3, "John Doe", 2021);
	        Video video1 = new Video("V001", "Inception", 2, 148, "Christopher Nolan", "Sci-Fi", 2010);
	        CD cd1 = new CD("CD001", "Thriller", 10, 42, "Michael Jackson", "Pop");

	       
	        libraryItems.add(book1);
	        libraryItems.add(journal1);
	        libraryItems.add(video1);
	        libraryItems.add(cd1);

	        
	        for (Item item : libraryItems) {
	            System.out.println(item);
	        }

	        
	        System.out.println("\nChecking out a copy of 'Effective Java': " + book1.checkOut());
	        System.out.println("Remaining copies of 'Effective Java': " + book1.getCopies());

	        book1.checkIn();
	        System.out.println("After check in, copies of 'Effective Java': " + book1.getCopies());
	    }
	}



