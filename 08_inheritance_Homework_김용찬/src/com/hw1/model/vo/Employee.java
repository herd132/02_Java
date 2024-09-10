package com.hw1.model.vo;

public class Employee extends Person {
	
	private int salary;
	private String dept;
	
	Employee(){}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age,height,weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String information() { // 이름 : 홍길동 / 나이 : 20 / 신장 : 180 / 몸무게 : 55 / 급여 : 1000000 / 부서 : 연구팀
		return super.information() +
				String.format(" / 급여 : %d / 부서 : %s", salary, dept);
	}
	
	
	
	

}
