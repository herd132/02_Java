package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		/*
		 * 키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
		 * 짝수가 아니면 “홀수입니다.“를 출력하세요.
		 * 양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		 */
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num1 = sc.nextInt();
		
		if( num1 <= 0) {
			System.out.println("양수만 입력해주세요");
			
		} else if ( num1 % 2 == 0){
			System.out.println("짝수입니다");
			
		} else {
			System.out.println("홀수입니다");
		}
		
	}
	
		
	
	public void practice2() {
		
		System.out.print("국어점수 : ");
		int ko = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = ko + math + eng;
		
		double avg = (double)sum / 3;
		
		if( ko >= 40 && math >= 40 && eng >= 40 && avg >= 60 ) {
			System.out.println("국어 : " + ko);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다");
			
		} else{
			System.out.println("불합격입니다.");
		}
				

	}
	
	
	
	public void practice3() {
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch (month) { 
		
		case 1 : case 3 : case 5 : case 7 :	case 8 : case 10 : case 12 :
			 System.out.println(month + "월은 31일 까지 있습니다.");
			 break;
			 
		case 4 : case 6 : case 9 : case 11 :
			 System.out.println(month + "월은 30일 까지 있습니다.");
			 break;
			 
		case 2 : System.out.println("2월은 28일 까지 있습니다."); break;
			 
		default : System.out.println(month + "월은 잘못 입력된 달입니다."); 
		}

	}
		
	
	
	public void practice4() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height*height);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			
			System.out.print("저체중");
			
		} else if(bmi < 23) {
			
			System.out.println("정상체중");
			
		} else if(bmi < 25) {
			
			System.out.println("과체중");
			
		} else if(bmi < 30) {
			
			System.out.println("비만");
			
		} else {
			
			System.out.println("고도 비만");
		}
		
	}
	
	
	
	public void practice5( ) {
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int end = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int mis = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int chk = sc.nextInt();
		
		double total = mid * 0.2 + end * 0.3 + mis * 0.3 + chk;
		System.out.println("==============결과=============");
		
		if(chk >=21) {
			System.out.println("Error [출석 횟수는 최대 20회 입니다]");
			return;
		}
		
		if (chk >= 14 && total >= 70) {
		System.out.println("중간 고사 점수(20) : " + mid * 0.2);
		System.out.println("기말 고사 점수(30) : " + end * 0.3);
		System.out.println("과제 점수(30) : " + mis * 0.3);
		System.out.println("출석 점수(20) : " + chk);
		System.out.println("총점 : " + total);
		System.out.println("PASS");
		
		} else if (chk >= 14 && total < 70) {
			System.out.println("중간 고사 점수(20) : " + mid * 0.2);
			System.out.println("기말 고사 점수(30) : " + end * 0.3);
			System.out.println("과제 점수	(30) : " + mis * 0.3);
			System.out.println("출석 점수	(20) : " + (double)chk);
			System.out.println("총점 : " + total);
			System.out.println("Fail [점수 미달] ");
		}
		else if (chk < 14) {
			System.out.printf("Fail [출석 횟수 부족 (%d/20)]", chk);
		}

	}
	
	
}