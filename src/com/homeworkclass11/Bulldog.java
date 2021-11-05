package com.homeworkclass11;

public class Bulldog {
	String name;
	String breed;
	String color;
	Double wiegth;
	int age;
	char gender;

	void waggleTail() {
		System.out.println("Bulldog waggles their tail");
	}

	void eat() {
		System.out.println("Bulldog eats so much food");
	}

	public static void main(String[] args) {

		Bulldog buldog = new Bulldog();

		buldog.name = "Kane";
		buldog.breed = "Bulldog";
		buldog.color = "Black";
		buldog.wiegth = 50.7;
		buldog.age = 5;
		buldog.gender = 'M';
		System.out.println("My dog name is " + buldog.name);
		System.out.println("My dog breed is " + buldog.breed);
		System.out.println("The color of my dog is " + buldog.color);
		System.out.println("The wiegth of my dog is " + buldog.wiegth);
		System.out.println("The age of my dog is " + buldog.age);
		System.out.println("The gender of my dog is " + buldog.gender);
		buldog.waggleTail();
		buldog.eat();

	}

}
