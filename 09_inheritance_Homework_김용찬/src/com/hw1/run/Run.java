package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {

	public static void main(String[] args) {
		
		Book b1 = new Novel();
		Book b2 = new Textbook();
		Book b3 = new Poetry();
		
		Book[] arr = new Book[3];
		
		arr[0] = new Novel("해리포터", "J.K롤링", "판타지");
		arr[1] = new Textbook("자바 프로그래밍", "James Gosling", "컴퓨터 과학");
		arr[2] = new Poetry("우리들의 사랑시", "김소월", 30);
		for(int i = 0; i < arr.length; i++) {
			arr[i].displayInfo();
			
		}
		
	}
	
}
