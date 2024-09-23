package com.hw2.run;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {
	
	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();			
		Tiger tiger = new Tiger();
		tiger.setName("호랑이");
		zoo.addAnimal(tiger);
		
		Monkey monkey = new Monkey();
		monkey.setName("원숭이");
		zoo.addAnimal(monkey);
		
		zoo.displayMenu();
	}
	
}
