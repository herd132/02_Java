package com.hw2.model.dto;

public abstract class Person{

	protected String id;
	protected String name;
	
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}

	abstract String getInfo();
	
	
}
