package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("당신의 나이는 ? : ");
		int age = sc.nextInt();
		String old = age >= 20 ? "저는 성인입니다" : "저는 미성년입니다"; 
		System.out.println(old);
		System.out.print("청소년 입니까? ");
		System.out.println((age >= 13) && (age <= 19));
		System.out.printf("노인이거나 어린이 입니까? ");
		System.out.println((age >= 65) || (age <= 12));
		
		
		
	}
}
