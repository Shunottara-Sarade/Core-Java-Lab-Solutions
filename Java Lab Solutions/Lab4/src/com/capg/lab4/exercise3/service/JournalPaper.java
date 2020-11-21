package com.capg.lab4.exercise3.service;

public class JournalPaper extends WrittenItem{

	private int yearPublished;
	
	public JournalPaper(int id, String title, int copies,String author, int yearPublished) {
		super(id,title,copies,author);
		this.yearPublished=yearPublished;
	}
	
	public int getYearPublished() {
		return yearPublished;
	}

	@Override
	public void write() {
		System.out.println("Write method in JournalPaper class");
		
	}
	
}