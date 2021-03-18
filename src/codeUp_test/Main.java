package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		Integer[] I = new Integer[c+1];
		
		for(int i = 0; i < I.length-1; i++) {
			I[0] = a;
			I[i+1] = I[i] + b;
		}
		System.out.println(I[c-1]);
		
	
		sc.close();

	}

}
