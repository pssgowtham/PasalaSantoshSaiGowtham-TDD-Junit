package com.epam.tdd_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

	Baka ittop;
	
	@BeforeEach
	void setUp() {
		ittop=new Baka();
	}
	@Test
	void testEmpty() {
		String hm=ittop.fun("");
		assertEquals("", hm);
	}
	@Test
	void testSingle() {
		assertEquals("",ittop.fun("A"));
	}
	
	@Test
	void testMany() {
		assertEquals("ABCADD",ittop.fun("AAABCADD"));
	}

}
