package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice { // 기능 제공용 클래스
	// 메서드..
	
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1() {
			
		System.out.printf( "인원수 : ");
		
		int input1 = sc.nextInt();
		
		System.out.printf( "사탕 개수 : ");
		
		int input2 = sc.nextInt();
		 
		int result1 = input2 / input1 ;
		int result2 = input2 % input1 ;
		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남은 사탕 개수 : " + result2);
	}
	
	public void practice2() {
			
			
		    System.out.print("이름 : ");
		    String name1 = sc.nextLine();
		    
		    System.out.print("성별: ");
		    String male = sc.nextLine();

		    System.out.print("성적: ");
		    double score = sc.nextInt();
		    
		    System.out.print("학년: ");
		    int grade = sc.nextInt();

		    System.out.print("반: ");
		    int class1 = sc.nextInt();

		    System.out.print("번호: ");
		    int num1 = sc.nextInt();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 이다.",grade, class1, num1, name1, male, score);
	}
	
	public void practice3() {
		
		
			System.out.printf("국어 : ");
			int lang = sc.nextInt();
			
			System.out.printf("영어 : " );
			int eng = sc.nextInt();
			
			System.out.printf("수학 : " );
			int math = sc.nextInt();
			
			System.out.println();
			
			int result2 = lang + eng + math;
			double result3 = result2 / 3.0;
			System.out.printf("합계 : %d\n", result2);
			System.out.printf("평균 : %.1f", result3);
	}

	
	
}
