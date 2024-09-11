package com.hw1.model.dto;

public class Textbook extends Book {

	private String subject;
	
	public Textbook() {}

	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}
	
	@Override
	public void displayInfo(){
		System.out.println("[시집] 제목 : " + getTitle() + " / 저자 : " + getAuthor() + " / 과목 : " + subject );
	}
	
	
	
	
}
