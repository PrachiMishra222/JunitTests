package com.cts;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.junit.jupiter.api.Test;

public class Convertor {

		NumberFormat fm=new DecimalFormat("#0.00");

		public String inchesToCenti(double inches)
		{
			return fm.format(inches*2.54);
		}
		
		public String celsiousToFarenheit(double cel)
		{
			return fm.format( (cel*1.8)+32);
		}
		public String pixcelsToInches(double pixel)
		{
			return fm.format(pixel*(1/96));
		}
		
		public String binToDec(String bin)
		{
			return fm.format(Integer.parseInt(bin,2));
		}
		public String decToOct(int dec)
		{
			return (Integer.toOctalString(dec));
		}
		public String decToHex(int dec)
		{
			return (Integer.toHexString(dec));
		}
		
	


}
