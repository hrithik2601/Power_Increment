package com.prep.pattern;

import java.util.Scanner;

public class Power_Increment {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your value: ");
		int num = scn.nextInt();
		
		for(int i =1; i<=num ;i++) {
			int n = scn.nextInt();
			long sum =0;
			for(int j=1;j<=n;j++) {
				sum += (long) Math.pow(j, j);
		    }
			System.out.println(sum);
		}
	}

}
