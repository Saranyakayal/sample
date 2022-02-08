package org.assignments;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int odd = s.nextInt();
		
		if (odd % 2==0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd number");

		}
		
		s.close();
	}
}

