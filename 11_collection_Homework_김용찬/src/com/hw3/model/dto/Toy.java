package com.hw3.model.dto;

import java.util.Objects;
import java.util.Set;

public class Toy {

	private String name;
	private int age;
	private int price;
	private String color;
	private String manufactureDate;
	private Set<String>materials;
	
	public Toy() {}

	public Toy(String name, int age, int price, String color, String manufactureDate, Set<String> materials) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.manufactureDate = manufactureDate;
		this.materials = materials;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Set<String> getMaterials() {
		return materials;
	}

	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, color, manufactureDate, materials, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color)
				&& Objects.equals(manufactureDate, other.manufactureDate) && Objects.equals(materials, other.materials)
				&& Objects.equals(name, other.name) && price == other.price;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + 
				" / 사용가능연령 : " + age + " / 제조년월일 : " + manufactureDate + 
				" / 재료 : " + materials;
	}
	
	
}
