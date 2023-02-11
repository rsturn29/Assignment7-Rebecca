package com.coderscampus.assignment7;

public class CustomArrayList<T> implements CustomList<T> {

	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {

		return add(size, item);
	}

	private Object[] arraySizeIncrease() {
		Object[] newArray = new Object[size * 2];
		for (int i = 0; i < size; i++) {
			 newArray[i] = items[i] ;
		}
		return newArray;
	}

	@Override
	public int getSize() {

		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index >= size)
			throw new IndexOutOfBoundsException("Out of Bounds ");
		return (T) items[index];

	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if( index > size ) {
			throw new IndexOutOfBoundsException("Adding item at index : " + index + " is out of Bounds");
		}
		if (size == items.length) {
			items = arraySizeIncrease();
		}
		for (int i = size-1; i >= index; i--) {
			items[i+1] = items[i];
		}
		
		items[index] = item;
		size++;
		
		return true;
	
	
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index)throws IndexOutOfBoundsException{
		if(index >= size) {
			throw new IndexOutOfBoundsException( "Item at index : " + index + " is out of Bounds ");
		}
		T removedItem = (T) items[index];
		
		for (int i = index; i < size-1; i++) {
			items[i]=items[i+1];
		}
		size--;
		return removedItem;
	}
}
