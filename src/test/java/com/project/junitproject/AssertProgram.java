package com.project.junitproject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertProgram {
	Demo d=new Demo();
	@Test
	public void testAssertEqual() {
		assertEquals('a','a');
	}
	@Test
	public void testAssertNotEqual() {
		assertNotEquals(5,10);
	}
	

	@Test
	public void testAssertTrue() {
		boolean a=10>7;
		assertTrue(a);
	}
	
	@Test
	public void testAssertFalse() {
		boolean a=10<7;
		assertFalse(a);
	}
	@Test 
	public void testSame() {
		assertSame("nisha","nisha");
	}
	
	@Test 
	public void testNotSame() {
		assertNotSame(4,5);
	}
	@Test
	public void testNull() {
		assertNull(null);
	}
	@Test
	public void testNotNull() {
		assertNotNull("jkl");
	}
	@Test
	public void testArrayEquals() {
		int[] a= {2,4,5};
		int[] b= {2,4,5};
		assertArrayEquals(a,b);
	}

	String[] b= {"Anu","Arun","Raju","Vinay"};
	@Test
	public String maxi() {
	assertEquals(d.findMax(b),"vinay");
	return "same";
	 
	}
}
	
