package com.homeworkclass11;

public class Labrador {
	String name;
	String breed;
	String color;
	String bloodType;
	int age;
	int weigth;
	char gender;

	void movesFast() {
		System.out.println("Labrador moves fast");
	}

	void eats() {
		System.out.println("Labrador eats less");
	}

	public static void main(String[] args) {

		Labrador lab = new Labrador();

		lab.name = "Kangro";
		lab.breed = "Labrador";
		lab.color = "Whitle";
		lab.bloodType = "A+";
		lab.age = 34;
		lab.weigth = 45;
		lab.gender = 'M';

		System.out.println("My dog name is " + lab.name);
		System.out.println("Labrador color is "+lab.color);
		System.out.println("Labrador blood type is "+lab.bloodType);
		System.out.println("Labrador age is "+lab.age);
		System.out.println("Labrador weigth is "+lab.weigth);
		System.out.println("Labrador gender is "+lab.gender);
		lab.eats();
		lab.movesFast();
	}
}
