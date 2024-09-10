package com.hw1.model.vo;

public class Student extends Person {

	private int grade;
	private String major;
	
	public Student() {}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age,height,weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}

	@Override
	public String information() { // 이름 : 홍길동 / 나이 : 20 / 신장 : 180 / 몸무게 : 55 / 학년 : 3 / 전공 : 컴공
		return super.information() +
				String.format(" / 학년 : %d / 전공 : %s",
						grade, major);
	}
	
	
}
