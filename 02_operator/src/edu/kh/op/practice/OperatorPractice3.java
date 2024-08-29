package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("멤버십 있으세요?('yes' or 'no') : ");
		String member = sc.nextLine();
		System.out.println(member);
		
		System.out.printf("가격을 입력 하세요 : ");
		int price = sc.nextInt();
		System.out.println(price);
		
		
	}
}
