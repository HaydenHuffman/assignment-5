package com.coderscampus;

import java.util.ArrayList;

public class CrudApp {
	
	public static void addItem(ArrayList<String> list, String string) {
		list.add(string);
	}
	
	public static void readList(ArrayList<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("---------");
	}
	
	public static void updateList(ArrayList<String> list, String one, String two ) {
		int i = 0;
		for (String string : list) {
			if (one == string) {
				list.set(i, two);	
			} else {
				i++;
			}
		}
		
	}
	public static void removeItem(ArrayList<String> list, String string) {
		list.remove(string);
	}
		
	public static void main(String[] args) {
		ArrayList<String> chores = new ArrayList<>();
		addItem(chores, "Wash Dishes");
		addItem(chores, "Fold Laundry");
		addItem(chores, "Code For an Hour");
		readList(chores);
		removeItem(chores, "Wash Dishes");
		readList(chores);
		updateList(chores, "Code For an Hour", "Code All Day");
		readList(chores);
		
		
		

	}

}
