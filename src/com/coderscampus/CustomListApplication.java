package com.coderscampus;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			myCustomList.add(String.valueOf(i));
		}
	
		
		
		
		// then you should validate that all the elements you've inserted actually exist in your data structure
		for (int i = 0; i < myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));
			
		
		}
		
		System.out.println(myCustomList.getSize());
	}
	
}
