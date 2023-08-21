package com.coderscampus.assignment5;


public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	@Override
	public boolean add(T item) {
		for (int i = 0; i <= items.length + 1; i++) {
			if (i == items.length) {
				Object[] newItems = new Object[items.length * 2];
				for (int j = 0; j < items.length; j++) {
					newItems[j] = items[j];
				}
				items = newItems;

			} else if (items[i] == null) {
				items[i] = item;
				return true; 
			}
		}
		return false;
	}

	@Override
	public int getSize() {
		int  count = 0;
		for (Object x : items) {
			if (x != null) {
				count++;
			}
		}
		return count;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		int count = 0;
		for (Object x : items) {
			if (count == index) {
				return (T) x;
			} else {
				count++;
			}
		}
		return null;
	}
	
}
