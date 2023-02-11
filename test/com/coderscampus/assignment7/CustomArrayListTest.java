package com.coderscampus.assignment7;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	// Three A's
	// Arrange, Act, Assert

	@Test
	void should_add_one_item_to_list() {

		CustomList<Integer> sut = new CustomArrayList<>();
		sut.add(10);

		assertEquals(10, sut.get(0));
		assertEquals(1, sut.getSize());
	}

	@Test
	void should_add_11_items_to_list() {
		CustomList<Integer> sut = new CustomArrayList<>();
		sut.add(1);
		sut.add(2);
		sut.add(3);
		sut.add(4);
		sut.add(5);
		sut.add(6);
		sut.add(7);
		sut.add(8);
		sut.add(9);
		sut.add(10);
		sut.add(11);

		for (int i = 0; i < 10; i++) {
			assertEquals(i + 1, sut.get(i));
		}
		assertEquals(11, sut.getSize());
	}

	@Test
	void should_add_21_items_to_list() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 1; i < 22; i++) {
			sut.add(i);
		}

		for (int i = 0; i < 21; i++) {
			assertEquals(i + 1, sut.get(i));
		}
		assertEquals(21, sut.getSize());

	}

	@Test
	void should_add_item_at_specific_index() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 1; i < 22; i++) {
			sut.add(i);
		}
		sut.add(11, 55);

		assertEquals(55, sut.get(11));
	}

	@Test()
	void should_return_out_of_bounds_adding_item() {
		
		try {
			CustomList<Integer> sut = new CustomArrayList<>();

			for (int i = 1; i < 22; i++) {
				sut.add(i);
			}
		sut.add(27, 15);
		fail("Should throw IndexOutOFBoundsException");
		}catch (IndexOutOfBoundsException e) {
			assertEquals(e.getMessage(), "Adding item at index : 27 is out of Bounds");
		}
		
	}
	@Test
	void should_remove_item_at_given_index() {
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 1; i < 22; i++) {
			sut.add(i);
		}
		Integer removeItem = sut.remove(8);

		assertEquals(9, removeItem );
		
	}
	@Test
	void should_return_out_of_bounds_removing_item() {
		try{
			CustomList<Integer> sut = new CustomArrayList<>();
		

		for (int i = 1; i < 22; i++) {
			sut.add(i);
		}
		sut.remove(25);
		fail("Should throw IndexOutOfBoundsException");
	}catch (IndexOutOfBoundsException e) {
		assertEquals(e.getMessage(), "Item at index : 25 is out of Bounds " );
	}
	}
}
