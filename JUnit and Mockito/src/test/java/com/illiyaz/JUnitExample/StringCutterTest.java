package com.illiyaz.JUnitExample;



import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.illiyaz.JUnitExample.Classes.StringCutter;


class StringCutterTest {
	StringCutter cutter1=new StringCutter("illiyaz",2);
	StringCutter cutter2=new StringCutter("Uroosa",3);
	
	@BeforeEach
	public void BeforeTest() {
		System.out.println("Lets Go");
	}
	
	

	
	@Test
	@Timeout(value = 10,unit=TimeUnit.MILLISECONDS)
	public void test1() {
		 String k= cutter1.Cutter();
		 assertEquals("liyaz",k);
		 System.out.println("test1 done");
		 
	}
	
	@Test
	public void test2() {
		String k=cutter2.Cutter();
		assertEquals("osa",k);
		System.out.println("test2 done");
	}
	
	@Test
	public void test3() {
		assertTrue(cutter1.State());
		System.out.println("test3 done");
	}
	@Test
	public void test4() {
		assertFalse(cutter2.State());
		System.out.println("test4 done");
	}
	
	@Test
	public void test5_EleList() {
		String[] a= {"i","l","l","i","y","a","z"};
		//String[] b= {"a","b"};
		String[] c=cutter1.EleList();
		assertArrayEquals(a,c);
		System.out.println("test5 array comparison done");
		
		
	}
	@Test
	public void test6_FindLetter() {
		String z=cutter1.Find_letter("o");
		assertEquals("false",z);
		System.out.println("test6 find letter done");
	}
	
	
	@AfterEach
	public void AfterTest() {
		System.out.println("Test case Done");
	}
	
	
}
