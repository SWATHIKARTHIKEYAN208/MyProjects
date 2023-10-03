package com.project.junitproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestCalculator {
	Calculator c=new Calculator();
	
//	@Autowired
    Demo d=new Demo();
	
	@Before
	public void hi() {
		System.out.println("Hello");
		//return "Hello";
	}
	
	
	int[] a= {3,2,4,7,6};
	@Test
	public void mini() {
		int b=d.findMin(a);
		assertEquals(b,2);
	}
	
	
//	@Test
//	public void demo() {
//	d.print(); }
	@Test
	public void testAdd() {
		c.add(10,20);
		
	}
	@Test
	public void testSub() {
		System.out.println(c.sub(20,10));
	}
	@Test
	public void testMul() {
		System.out.println(c.mul());
	}
	@Test
	public void testDiv() {
		c.div();
		
	}
	@Test
	public void checkIt() {
		assertEquals(c.add(10,5),c.sub(20, 5));
		System.out.println("true");
	}
	
	@After
	public void display() {
		//return "Bye";
		System.out.println("Bye");
	}
}
	


