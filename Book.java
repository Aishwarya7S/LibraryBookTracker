package com.library;

public class Book {
	private String id;
	private String title;
	private String author;
	private boolean isIssued;

	public Book(String id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
		}
	
	public String getId() {
		return id;
	}
	
	public boolean isIssued() {
		return isIssued;
	}

	public void setIssued(boolean issued) {
		isIssued = issued;
	}
	
	public String toString() {
        return "ID: " + id + " \n Title: " + title + " \n Author: " + author +  " \n Status: " + (isIssued ? "Issued" : "Available");
    }
}
