package com.library;

import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Library lib = new Library();

		int choice;
		do {
			System.out.println("\n Library Menu");
			System.out.println("1. Add Book");
			System.out.println("2. Issue Book");
			System.out.println("3. Return Book");
			System.out.println("4. Show Available Books");
			System.out.println("5. Show All Books");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter Book ID: ");
				String id = sc.nextLine();
				System.out.println("Enter Title; ");
				String title = sc.nextLine();
				System.out.println("Enter Author: ");
				String author = sc.nextLine();
				Book book = new Book(id, title, author);
				lib.addBook(book);
				break;

			case 2:
				System.out.print("Enter Book ID to issue: ");
				String issueId = sc.nextLine();
				lib.issueBook(issueId);
				break;

			case 3:
				System.out.print("Enter Book ID to return: ");
				String returnId = sc.nextLine();
				lib.returnBook(returnId);
				break;

			case 4:
				System.out.println("Available Books => ");
				lib.showAvailableBooks();
				break;

			case 5:
				System.out.println("All  Books => ");
				lib.showAllBooks();
				break;

			case 6:
				System.out.println("Exiting...Thank you!");
				break;

			default:
				System.out.println("Invalid choice! Try again.");

			}
		} while (choice != 6);
		sc.close();

	}

}
