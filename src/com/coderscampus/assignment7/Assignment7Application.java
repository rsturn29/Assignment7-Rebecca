package com.coderscampus.assignment7;

public class Assignment7Application {

	public static void main(String[] args) {
		CustomList<Integer> myCustomList = new CustomArrayList<>();

		myCustomList.add(1);myCustomList.add(2);myCustomList.add(3);myCustomList.add(4);
		myCustomList.add(5);myCustomList.add(6);myCustomList.add(7);myCustomList.add(8);
		myCustomList.add(9);myCustomList.add(10);myCustomList.add(11);myCustomList.add(12);
		myCustomList.add(9, 45);
		myCustomList.remove(2);
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}

	}

}
