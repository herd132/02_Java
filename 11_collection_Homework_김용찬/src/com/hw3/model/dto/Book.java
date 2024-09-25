package com.hw3.model.dto;

public class Book {
	
	private String title; // 제목
	private int price; // 가격
	private String writer; // 저자
	private String publisher; // 출판사
	private int bookNum; // 도서번호
	
	public Book() {}

	public Book(String title, int price, String writer, String publisher, int bookNum) {
		super();
		this.title = title;
		this.price = price;
		this.writer = writer;
		this.publisher = publisher;
		this.bookNum = bookNum;
	}
	

	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getWriter() {
		return writer;
	}



	public void setWriter(String writer) {
		this.writer = writer;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public int getBookNum() {
		return bookNum;
	}



	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}






	@Override
	public String toString() {
		return bookNum + "번 도서 : [도서제목 : " + title +
				" / 도서저자 : " + writer
				+ " / 도서가격 : " + price + "원 / 출판사 : " + publisher + "]";
	}
	
	
	
}
