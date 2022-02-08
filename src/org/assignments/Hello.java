package org.assignments;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your age");
		int age = sc.nextInt();	
		
		if (age >= 18) {
			System.out.println("Eleigible to Vote");
			
		} else {
			System.out.println("Not eligible to vote");

		}
		
sc.close();
}
}
