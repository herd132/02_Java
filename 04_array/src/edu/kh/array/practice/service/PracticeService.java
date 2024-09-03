package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService { // 기능 제공용
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int[] arr;
		int sum = 0;
		arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
			System.out.println();
			
		for (int i = 0; i < arr.length; i += 2) {
	            sum += arr[i];            
	    }
		
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}
	
	
	public void practice2() {
		
		int[] arr;
		int sum = 0;
		arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 9 - i;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 1; i < arr.length; i += 2 ) {
			sum += arr[i];
		}
		System.out.println("홀수 번째 인덱스 합 : " + sum);
	}
	
	
	public void practice3() {		
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
				
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice4() {
		
		int[] arr;
		arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
		System.out.print("입력 " + i + " : ");
		arr[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {			
			if(arr[i] == input) {
				System.out.println("인덱스 : " + i);
				flag = true;
			}
		}
		if( !flag ) {
			System.out.println("일치하는 값이 존재하지 않습니다");
		}
	}	
		
	
	public void practice5() {
		
        System.out.print("문자열 : ");
        String input = sc.nextLine();
     
        char[] arr = new char[input.length()];
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = input.charAt(i);
        }

        System.out.print("문자 : ");
        char ch = sc.next().charAt(0);
        
        int count = 0;
      
        System.out.print(input + "에 " + ch + "가 존재하는 위치(인덱스) : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n" + ch + "개수 : " + count);
    }
	
	
	public void practice6() {
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int sum = 0;
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : "  );
			arr[i] = sc.nextInt();
		}
		
		System.out.println( Arrays.toString(arr) );
			
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.print("총 합 : " + sum);
	}
	
	
	public void practice7() {
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		char[] arr = new char[input.length()];
        
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = input.charAt(i);        	
        }
        
        for(int i = 8; i < 14; i++) {
        	arr[i] = '*';
        }
        
        System.out.println(arr);			
	}
	
	
	public void practice8() {

		int input;

        while (true) {
            System.out.print("정수 : ");
            input = sc.nextInt();

            if (input >= 3 && input % 2 == 1) {
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }

        int[] arr = new int[input];
        int mid = input / 2;
         
        for (int i = 0; i <= mid; i++) {
            arr[i] = i + 1;
        } 
        for (int i = mid + 1; i < input; i++) {
            arr[i] = input - i;
        }
        
        System.out.println( Arrays.toString(arr) );
        
    }
}