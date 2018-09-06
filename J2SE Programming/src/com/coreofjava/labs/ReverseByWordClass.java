package com.coreofjava.labs;

import java.util.Scanner;

public class ReverseByWordClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = scanner.nextLine();
		ReverseByWord ro = new ReverseByWord();
		ro.setRevStr(str);
		System.out.println(ro.reverseByWord());
		

	}

}
