package com.coreofjava.labs;

public class StringStringOperationClass {

	public static void main(String[] args) {
		String s = new String("Soppari,Shiva.Shanker");
		//System.out.println("Hello, Shiva Shanker");
		StringStringOperation so = new StringStringOperation();
		so.setStr(s);
		String str[] = so.splitString();
		for(String item : str)
		{
			System.out.println(item);
		}
	}

}
