package com.coderscampus;


public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int i = 0;

	@Override
	public boolean add(T item) {
			if (i == items.length) {
				expandBackingArray();
			}
			items[i] = item;
			i++;
			return true; 
			
		}
		
	
		
	public void expandBackingArray() {
		Object[] oldItems = items;
		items = new Object[items.length * 2];
		for (int j = 0; j < oldItems.length; j++) {
            items[j] = oldItems[j];
        }
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
