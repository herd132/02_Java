package com.hw3.model.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.hw3.model.dto.Toy;

public class ToyFactory extends Toy {

	private Scanner sc = new Scanner(System.in);
	private Set<Toy>toySet = new HashSet<Toy>();
	private Map<Integer, String> materialMap = new HashMap<Integer, String>();


	public ToyFactory() {
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");	
	}
	
	
	
	public void displayMenu() {
		int menuNum = 0;
		do {
			System.out.println("<< 플레이타임 공장 >>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.print("선택 : ");
			
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : 
				int index = 0;
				for(Toy toy : toySet) {
					System.out.print( 1 + index++ + ".");
					System.out.println( toy );
				}
				break;
			case 2 : 
//				addToy();
				break;
			case 3 : 
				break;
			case 4 : 
				break;
			case 5 : 
				break;
			case 6 : 
				addmaterial();
				break;
			case 7 : 
				removematerial();
				break;
			}
			
		} while(0 != menuNum);
		
		
	}



//	public String addToy(){
//		
//		System.out.println("<새로운 장난감 추가>");
//		
//		System.out.print("장난감 이름 : ");
//		String name = sc.next();
//		
//		System.out.print("사용 가능 연령 : ");
//		int age = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("가격 : ");
//		int price = sc.nextInt();
//		
//		System.out.print("색상 : ");
//		String color = sc.next();
//		sc.nextLine();
//		
//		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
//		String manufactureDate = sc.next();
//		sc.nextLine();
//		
//		System.out.println("사용 가능한 재료 목록:");
//		System.out.println(materialMap);
//		System.out.print("추가할 재료의 번호를 입력하세요 (종료하려면 'q'를 입력하세요 : )");
//		String materialsNumber = sc.next();
//
//		if(materialMap.containsKey(materialsNumber) == true) {
//		} else if(materialsNumber.equals('q') == true ) {
//			// q면 종료
//		} else {
//			System.out.println("잘못된 번호입니다 다시 입력해주세요");
//		}
//   }
	
	public void addmaterial() {
		
		System.out.println("<재료추가>");
		System.out.println("현재 등록된 재료");
		System.out.println(materialMap);
		
		System.out.print("재료 고유번호(Key) 입력:");
		int keyNum = sc.nextInt();
		
		System.out.print("재료명 입력:");
		String materialname = sc.next();
		
		if (materialMap.containsKey(keyNum) == true) {
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다");
			System.out.print("덮어쓰시겠습니까? (Y/N):");
			String yorn = sc.next();
			String upyorn = yorn.toUpperCase();
			if(upyorn.equals("Y")) {
				System.out.println("재료가 성공적으로 덮어쓰기 되었습니다.");
				materialMap.put(keyNum, materialname);
			}else {
				System.out.println("취소 되었습니다");
			}
			
		}else {
			materialMap.put(keyNum, materialname);
			System.out.println("재료 " + materialname + " 이/가 추가되었습니다");
		}
		
	}
	
	
	public void removematerial() {
		System.out.println("<재료 삭제>");
		System.out.println("현재 등록된 재료");
		System.out.println(materialMap);
		System.out.println("===================");
		System.out.print("삭제할 재료명 입력 : ");
		String removename = sc.next();
		if(materialMap.containsValue(removename)) {
			materialMap.values().remove(removename);
			System.out.println("재료가 삭제되었습니다");
		}else {
			System.out.println("재료명을 다시 확인 해주세요");
		}
		
		
		
	}
		
			
			
			
		
}
