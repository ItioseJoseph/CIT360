package edu.ItioseJoseph.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyJunitTest {
	
	@Test
	public void test() {
		int num = 8;
		String temp = null;
		String str = ("Junit is working fine");
		
        assertArrayEquals(new int[]{6},new int[]{4});
		
		assertEquals("Junit is working fine", str);
		
		assertFalse(num > 10);
		
		assertTrue(num < 8);
		
		assertNotNull(temp);
		
	}

}
