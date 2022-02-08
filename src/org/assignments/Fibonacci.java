package org.assignments;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int n1=0,n2=1,n3;
		System.out.println("Fibonacci Series");
		System.out.print(n1+" " +n2);
		
		for (int i = 2; i <=100; i++) {
			
			n3=n1+n2;// n3 = 1+2
			System.out.print(" "+n3); //3
			n1=n2;// 1
			n2=n3;//2
			
			
		}
			
		
	}

}
