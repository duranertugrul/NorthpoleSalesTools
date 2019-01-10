package com.northpolesoft;

public class Main {
	public static void main(String[] args) {
		
		SalesData salesData = new SalesData();
		
		displayGreeting();
		
		salesData.display();
	}
	
	private static void displayGreeting() {
		System.out.println("Hello Happy Sales People!!");
		System.out.println("This App Shows Sales Data");
		System.out.println("-------------------------");
		
		System.out.println("Test 1");
		System.out.println("Test 2");
		System.out.println("Test 3");
		System.out.println("Test 5");
		System.out.println("Test 7");
	}


}
