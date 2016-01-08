package com.tinat.tinatREST;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPage {

	@Test
	public void testPage() {
		Page newPage = new Page(1);
		assertEquals("New Title", newPage.getTitle());
		assertEquals("New Paragraph 1", newPage.getParagraph1());
		assertEquals("New Paragraph 2", newPage.getParagraph2());
		assertEquals(1, newPage.getPageNumber());
	}

}
