package com.javaintro;

public class Student {
	static String Collagename;
	static String Location;
	int rno;
	String name;
	String mobile;
	String Branch;
	public static void main(String[] args) {
		System.out.println(Collagename);
		System.out.println(Location);
		Student s1=new Student();
		s1.rno=7452;
		s1.name="shivani";
		s1.mobile="9059440435";
		s1.Branch="cse";
		System.out.println("rno: " +s1.rno);
		System.out.println("name: " +s1.name);
		System.out.println("mobile: " +s1.mobile);
		System.out.println("Branch: " +s1.Branch);
	}

}
