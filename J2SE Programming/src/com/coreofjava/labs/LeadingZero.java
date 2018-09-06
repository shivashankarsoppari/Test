package com.coreofjava.labs;
	
	
public class LeadingZero {
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public String leadingZeros()
	{
		number = String.format("%010d", Integer.parseInt(number));
		return number;
	}
	public String leadingZerosManually()
	{
		int l = 10 - number.length();
		StringBuffer sb = new StringBuffer();
		for(int i = 1;i<=l;i++)
		{
			sb.append("0");
		}
		sb.append(number);
		number = sb.toString();
		
		return number;
	}
}


































