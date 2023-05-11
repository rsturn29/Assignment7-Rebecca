package com.coderscampus.assignment7;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	// Three A's
	// Arrange, Act, Assert
	private CustomList<Integer> sut;

	@BeforeEach
	void before_each_test() {
		sut = new CustomArrayList<>();
		for (int i = 0; i < 22; i++) {
			sut.add(i + 1);
		}
	}

	@Test
	void should_return_size_of_list() {
		assertEquals(22, sut.getSize());
	}

	@Test
	void should_return_index_of_occurrence_of_item() {
		assertEquals(1, sut.get(0));
		assertEquals(11, sut.get(10));

	}

	@Test
	void should_add_item_to_end_of_list() {
		assertTrue(sut.add(23));
		assertEquals(23, sut.getSize());
		assertEquals(23, sut.get(22));
	}

	@Test
	void should_add_item_at_specific_index() {

		sut.add(11, 55);

		assertEquals(55, sut.get(11));
	}

	@Test
	void should_remove_item_at_given_index() {

		Integer removeItem = sut.remove(8);

		assertEquals(9, removeItem);
		assertNull(sut.get(21));
		assertEquals(22, sut.getSize());

	}

	@Test()
	void should_return_out_of_bounds_when_getting_out_of_bounds() {
		String messageExceptionFail = "Expected IndexOutOfBoundsException";
		Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
			sut.get(45);
		}, messageExceptionFail);

		String expectedExceptionMessage = "Out of Bounds ";
		assertEquals(expectedExceptionMessage, exception.getMessage());
	}

	@Test()
	void should_return_out_of_bounds_exception_adding_item() {
		String messageExceptionFail = "Expected IndexOutOfBoundsException";
		Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
			sut.add(77, 15);
		}, messageExceptionFail);

		String expectedExceptionMessage = "Adding item at index : 77 is out of Bounds";
		assertEquals(expectedExceptionMessage, exception.getMessage());
	}

	@Test
	void should_return_out_of_bounds_removing_item() {
		String messageExceptionFail = "Expected IndexOutOfBoundsException";
		Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
			sut.remove(80);
		}, messageExceptionFail);
		String expectedExceptionMessage = "Item at index : 80 is out of Bounds ";
		assertEquals(expectedExceptionMessage, exception.getMessage());
	}

}
