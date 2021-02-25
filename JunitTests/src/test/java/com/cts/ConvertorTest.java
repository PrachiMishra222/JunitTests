package com.cts;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestConvertor {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	System.out.println("SUBC");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	System.out.println("TDAC");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Sup");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Tdown");
	}

	@Test
	void testInchesToCentimeters() {
		//fail("Not yet implemented");
		Convertor obj1=new Convertor();
		double inches=5.6;
		String expected="14.22";
		String actual=obj1.inchesToCenti(inches);
		assertEquals(expected,actual);
		System.out.println(inches +" InchesToCentimeters : "+actual);
	}

	@Test
	void testCelciousToFarenheit() {
		//fail("Not yet implemented");
		Convertor obj1=new Convertor();
		double cel=5.6;
		String expected="42.08";
		String actual=obj1.celsiousToFarenheit(cel);
		assertEquals(expected,actual);
		System.out.println(cel +" CelciousToFarenheit: "+actual);
	}
	@Test
	void testPixcelsToInches() {
		//fail("Not yet implemented");
		Convertor obj1=new Convertor();
		double pixels=5.6;
		String expected="0.00";
		String actual=obj1.pixcelsToInches(pixels);
		assertEquals(expected,actual);
		System.out.println(pixels+" PixcelsToInches: "+actual);
	}
	@Test
	void testBinToDec() {
		//fail("Not yet implemented");
		Convertor obj1=new Convertor();
		String bin="1010";
		String expected="10.00";
		String actual=obj1.binToDec(bin);
		assertEquals(expected,actual);
		System.out.println( bin+" BinToDec: "+actual);
	}
	@Test
	void testDecToOct() {
		//fail("Not yet implemented");
		Convertor obj1=new Convertor();
		int dec=8;
		String expected="10";
		String actual=obj1.decToOct(dec);
		assertEquals(expected,actual);
		System.out.println( dec+" DecToOct: "+actual);
	}
	@Test
	void testDecToHex() {
		//fail("Not yet implemented");
		Convertor obj1=new Convertor();
		int dec=10;
		String expected="a";
		String actual=obj1.decToHex(dec);
		assertEquals(expected,actual);
		System.out.println( dec+" DecToHex: "+actual);
	}
}

