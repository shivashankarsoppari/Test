package com.coreofjava.labs;

import java.util.Scanner;

public class LeadingZeroCLass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LeadingZero lo = new LeadingZero();
		System.out.println("Enter number");
		lo.setNumber(scanner.next());
		System.out.println(lo.leadingZeros());
		System.out.println(lo.leadingZerosManually());		
		
		

	}

}
