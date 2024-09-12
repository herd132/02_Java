package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	
	private Prisoner[] prisoners; // 수감자 객체 배열 
	private int prisonerCount; 
	
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount = 0;
	}
	


	@Override
	public void addPerson(Person person) {
		if(person instanceof Prisoner && prisonerCount < prisoners.length  ) {
			prisoners[prisonerCount++] = (Prisoner)person;
			System.out.println("수감자가 추가되었습니다 - " + person.getInfo());
			
		}else {
			System.out.println("인원이 모두 충원되어 더 이상 추가 못함");
		}
		
	}

	@Override
	public void removePerson(String id) {
		
		for(int i = 0; i < prisonerCount; i++) { // 현재 등록된 수감자 수 만큼만 반복
			
			if(prisoners[i].getId().equals(id)) {
				System.out.println("수감자가 삭제되었습니다 - " + prisoners[i].getInfo());
				prisoners[i] = null;
				
				for(int j = i; j < prisonerCount - 1; j++) {
					// 삭제한 요소가 있는 i번째 인덱스부터 배열에 존재하는 직원 마지막 요소까지 순차접근
					prisoners[j] = prisoners[j + 1];
					// 배열 내 모둔 후속 요소를 왼쪽으로 한칸씩 이동함
				}
				
				prisoners[--prisonerCount] = null;
				// employeeCOunt 변수를 감소시켜 배열의 마지막 요소를 null로 설정하여 직원수 줄이기
				return;
			}
			
		}
		
		System.out.println("ID : " + id + "인 수감자를 찾을 수 없습니다.");
		
	}
		
	

	@Override
	public void displayAllPersons() {

		System.out.println("전체 수감자 명단 : ");
		for(int i = 0; i < prisonerCount; i++) {
			System.out.println(prisoners[i].getInfo());
	}
	
	}	
}