package com.string.mytest;

import junit.framework.TestCase;




public class StringUTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testStringu11() {
		StringU stringU=new StringU();
		CharSequence cs1="ABC";
		CharSequence cs2="a";
		int temp1=15;
		stringU.stringu(cs1, cs2, temp1);
		}
	
	public void testStringu22() {
		StringU stringU=new StringU();
		CharSequence cs1="";
		CharSequence cs2="";
		int temp1=15;
		stringU.stringu(cs1, cs2, temp1);
		}
	
	public void testStringu33() {
		StringU stringU=new StringU();
		CharSequence cs1="abc";
		CharSequence cs2="a";
		int temp1=15;
		stringU.stringu(cs1, cs2, temp1);
		}
	
	public void testStringu44() {
		StringU stringU=new StringU();
		CharSequence cs1="ABC";
		CharSequence cs2="A";
		int temp1=15;
		stringU.stringu(cs1, cs2, temp1);
		}
	
	public void testStringu55() {
		Stringex stringex=new Stringex();
		CharSequence cs1="ABC";
		CharSequence cs2="a";
		int temp=5;
		stringex.stringu(cs1, cs2, temp);
		//assertEquals("upper",stringex.stringu(cs1, cs2, temp) );
	}
		
	
}
