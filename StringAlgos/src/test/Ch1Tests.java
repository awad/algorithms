package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Ch1.Chapter1;

public class Ch1Tests {

	private Chapter1 Ch1;
	
	@Before
	public void setUp() throws Exception {
		Ch1 = new Chapter1();
	}

	@Test
	public void testQ1_1() {
		assertEquals(true, Ch1.Q1_1("halo"));
		assertEquals(true, Ch1.Q1_1("Halo"));
		assertEquals(false, Ch1.Q1_1("hello"));
		assertEquals(false, Ch1.Q1_1("HeLlo"));
		
	}

}
