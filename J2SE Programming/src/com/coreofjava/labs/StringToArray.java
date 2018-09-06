package com.coreofjava.labs;

public class StringToArray {
	private char ch[];

	public char[] getCh() {
		return ch;
	}

	public void setCh(char[] ch) {
		this.ch = ch;
	}
	public String charToString()
	{
		return String.valueOf(ch);
	}
	public String charToStringcopyValueOf()
	{
	
		return String.copyValueOf(ch);
	}
}
