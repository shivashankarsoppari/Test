package com.coreofjava.labs;

import java.util.Scanner;

public class ReverseClass {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();
		StringOPeration so = new StringOPeration();
		so.setStrVar(str);
		System.out.println("Reverse is : " + so.getReverse());
		System.out.println("Reverse without StringBuffer is :  " + so.stringReverse());
		scanner.close();
	}
}
