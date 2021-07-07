package test;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Intput Value");
		int x= sc.nextInt();
		
		String number = String.valueOf(x);
		
		char[] digit = number.toCharArray();
		
		System.out.print("Reverse Value:");
		
		for(int x1=digit.length-1;x1>=0;x1--) {
		
			System.out.print(digit[x1]);
			
		}
		
		
	}

}
