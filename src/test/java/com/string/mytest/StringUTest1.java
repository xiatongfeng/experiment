package com.string.mytest;

import junit.framework.TestCase;

public class StringUTest1 extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testStringu1() {
		StringU stringU=new StringU();
		CharSequence cs1="ABC";
		CharSequence cs2="a";
		int temp=5;
		
		assertEquals("aABCa",stringU.stringu(cs1, cs2, temp));
	}
	
	public void testStringu2() {
		StringU stringU=new StringU();
		CharSequence cs1="abc";
		CharSequence cs2="a";
		int temp=5;
		
		assertEquals("upper",stringU.stringu(cs1, cs2, temp));
	}
	public void testStringu3() {
		StringU stringU=new StringU();
		CharSequence cs1="ABC";
		CharSequence cs2="A";
		int temp=5;
		
		assertEquals("lower",stringU.stringu(cs1, cs2, temp));
	}
	
	public void testStringu4() {
		StringU stringU=new StringU();
		CharSequence cs1="";
		CharSequence cs2="";
		int temp=5;
		
		assertEquals("",stringU.stringu(cs1, cs2, temp));
	}
	public void testStringu5() {
		StringU stringU=new StringU();
		CharSequence cs1="QWE";
		CharSequence cs2="a";
		int temp=5;
		
		assertEquals("aQWEa",stringU.stringu(cs1, cs2, temp));
	}
	public void testStringu6() {
		StringU stringU=new StringU();
		CharSequence cs1="ASD";
		CharSequence cs2="b";
		int temp=5;
		
		assertEquals("bASDb",stringU.stringu(cs1, cs2, temp));
	}
}
