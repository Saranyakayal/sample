package org.assignments;

import java.util.Scanner;

public class Factorial {

	
	public static void main(String[] args) {
		
		int f=1;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		int n = num.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			f=f*i;
		}
		
		System.out.println("Factorial is " +f);
	num.close();	
	}
}

//