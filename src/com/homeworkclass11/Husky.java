package com.homeworkclass11;

public class Husky {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		/*Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  
		 * with specific  attributes and behaviors.
		 */

	
		Dog Husky=new Dog();
		
			Husky.name="Bill";
			Husky.breed="Husky";
			Husky.color="white";
			Husky.wiegth=40.6;
			Husky.age=3;
			Husky.gender='M';
			
			System.out.println("My dog name is "+Husky.name);
			System.out.println("The breed of my dog is "+Husky.breed);
			System.out.println("The color of my dog is "+Husky.color);
			System.out.println("The wiegth of my dog is "+Husky.wiegth);
			System.out.println("The age of my dog is "+Husky.age);
			System.out.println(("The gender of my dog is "+Husky.gender));
			Husky.dogsBark();
	}

}
