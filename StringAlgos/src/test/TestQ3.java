package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Ch1.DuplicateRemoval;

public class TestQ3 {

	@Test
	public void TestDuplicateRemoval() {
		//No duplicate
		assertEquals("halo", DuplicateRemoval.Q3_1("Halo"));
		
		//Simple case
		assertEquals("helo", DuplicateRemoval.Q3_1("Hello"));
		
		//First char
		assertEquals("abcd", DuplicateRemoval.Q3_1("AAbcd"));
		
		//Last char
		assertEquals("abcd", DuplicateRemoval.Q3_1("AbcdA"));
		
		//case difference
		assertEquals("abcd", DuplicateRemoval.Q3_1("Abcd"));
	}

}
