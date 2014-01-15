package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Ch1.Q2;

public class Q2Test {

	@Test
	public void test() {
		char [] a = new char []{'a', 'b','c','d','\0'};
		char [] aReverse = new char []{'d', 'c','b','a','\0'};
		char []result = Q2.ReverseString(a);
		System.out.println(result);
		assertEquals(true, isStringEqual(aReverse, result));
	}

	private boolean isStringEqual(char[] aReverse, char[] result) {
		
		int len1 = aReverse.length;
		int len2 = result.length;
		
		if (len1!=len2)
			return false;
		
		for(int i=0;i<len1;i++)
		{
			if(aReverse[i] != result[i])
				return false;
		}
		return true;
	}

}
