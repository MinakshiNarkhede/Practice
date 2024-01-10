package com.Demo;

public class Student {

	
	int studentId;
	String studentName;
	String studentCity;

public void study() {
	
	System.out.println(studentName + "  is studying");}

public void show() {
	
	System.out.println("My name is " + studentName);
	System.out.println("My id is " + studentId);
	System.out.println("My city is " + studentCity);
}

public void Behaviour() {
	
	if(studentCity.contains("mumbai")) {
		
		//System.out.println(studentName + " "+ studentCity + " " + studentId);
		
		//show();
		study();
		
		
		
	}else {
		System.out.println("no student found");
	}
}

}
