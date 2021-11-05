package com.homeworkclass11;


public class Phone {
	/* Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviors.
	 */
	String name;
	String  type;
	String  make;
	String  color;
	
	void playsMusicOnItunes() {
		System.out.println("Iphone plays music on itunes");
		
		}
	
	public static void main(String[]args) {
		
		Phone iphone=new Phone();
		iphone.name="iphone";
		iphone.type="iphone13";
		iphone.make="Apple";
		iphone.color="Blue";
		
	
		System.out.println("iphone name is "+iphone.name);
		System.out.println("iphone type is "+iphone.type);
		System.out.println("iphone make is "+iphone.make);
		System.out.println("iphone color is "+iphone.color);
		
		iphone.playsMusicOnItunes();
		
		System.out.println("***************Android*************");
		
		Phone Android=new Phone();
		
		Android.name="Samsung";
		Android.type="S15";
		Android.make="Samsun";
		Android.color="white";
	
		System.out.println("Android name is "+Android.name);
		System.out.println("Android type is "+Android.type);
		System.out.println("Android make is "+Android.make);
		System.out.println("Android color is "+Android.color);
		
		System.out.println("***************Nokia*************");
		
		Phone Nokia=new Phone();
		
		Nokia.name="Nokia";
		Nokia.type="G20";
		Nokia.make="Nokia";
		Nokia.color="Black";
		System.out.println("Nokia name is "+Nokia.name);
		System.out.println("Nokia name is "+Nokia.type);
		System.out.println("Nokia make is "+Nokia.make);
		System.out.println("Nokia color is "+Nokia.color);
		
}
	
}	
