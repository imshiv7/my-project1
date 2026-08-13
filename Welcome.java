package com.javaintro;

public class Welcome {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("welcome to java world");
		Class.forName("com.javaintro.Welcome");
		System.out.println("hello");
	}

}
