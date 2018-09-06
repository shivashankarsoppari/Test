package com.coreofjava.labs;

public class StringStringOperation {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	public String[] splitString()
	{
		String s[] = str.split(",|\\.");
		
		return s;
	}
}
