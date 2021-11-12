package com.homeworkclass11;

public class HWMethod03 {

	//Create a method that will say Hello in different language 
	//based on the country that will passed when method is executed.
	
	void language(String country) {
		String language;
		
		switch (country) {
		case "Canada":
			language="Hello";
			break;
		case"USA":
			language="Hello";
			break;
		case"Afghanistan":
			language="سلام";
				break;
			default:
				language="uknown";
			
		}
		System.out.println(language);
	}
}
