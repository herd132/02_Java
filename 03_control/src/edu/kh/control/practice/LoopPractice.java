package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
			
	public void practice1(){
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else {
			for(int i = 1; i <= num ; i++) {
				System.out.print(i);
			}
		}
	}
	
	
	public void practice2(){
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			 //5 4 3 2 1 num 5 i-- = 5 4 3 2 1
		} else {
			for(int i = num; i >= 1; i--) {
				System.out.print(i);
			}
		}
	}
	
	
		public void practice3(){
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		if(num <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		
		}else {
			
			for(int i = 1; i <= num; i++ ) {
				System.out.print(i + "=" + sum);
				sum += i; 
				
			}
		}
	}
}
