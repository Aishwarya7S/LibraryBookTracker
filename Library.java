package com.library;
import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<>();
	
	public void addBook(Book b) {
		books.add(b);
		System.out.println("Book added successfully.");
	}
	
	public void issueBook(String bookId) {
		for (Book b : books) {
			if (b.getId().equals(bookId)) {
				if (!b.isIssued()) {
					b.setIssued(true);
					System.out.println("Book issued successfully!");
	                return;
				} else {
					System.out.println("Book is already issued.");
                    return;
				}
			}
		}
		System.out.println("Book not found.");	
	}
	
	public void returnBook(String bookId) {
		for (Book b : books) {
			if (b.getId().equals(bookId)) {
				if (b.isIssued()) {
					b.setIssued(false);
                    System.out.println("Book returned successfully!");
                    return;
				}
			} else {
				 System.out.println("Book was not issued.");
                 return;
			}
		}
		System.out.println("Book not found.");
	}
	
	public void showAvailableBooks() {
		boolean found = false;
		
		for (Book b : books) {
			if (!b.isIssued()) {
				System.out.println(b);
				found = true;
			} 
		}
		if (!found) {
			System.out.println("No available books.");
		}		
	}
	
	public void showAllBooks() {
		if (books.isEmpty()) {
			System.out.println("No books in library.");
		} else {
			for (Book b : books) {
				System.out.println(b);
			}
		}
	}


}
