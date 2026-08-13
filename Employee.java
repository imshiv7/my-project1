package com.javaintro;

public class Employee {
	static String Departmentname;
	static String Location;
	int Empid;
	String Name;
	String Mobile;
	String email;
	public static void main(String[] args) {
		System.out.println("Department :" +Departmentname);
		System.out.println("Location :" +Location);
		//object1 info
		Employee shiv=new Employee();
		shiv.Empid= 1;
		shiv.Name="Shivani";
		shiv.Mobile="9059440435";
		shiv.email="shiv123@gmail.com";
		System.out.println("Empid :" +shiv.Empid);
		System.out.println("Name :" +shiv.Name);
		
		Employee surya=new Employee();
		
		
		
		
		

	}

}
