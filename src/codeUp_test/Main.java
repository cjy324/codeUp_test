package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		float b =  a/60;
		int c = a%60;

		
		System.out.printf("%.0f %d",b,c);

		
		
		
		sc.close();

	}

}

