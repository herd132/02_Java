package com.hw3.model.run;

import com.hw3.model.service.ToyFactory;

public class Run {

	public static void main(String[] args) {
		ToyFactory toyfactory = new ToyFactory();
		
		toyfactory.displayMenu();
	}
}
