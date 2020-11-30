package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		

		/*
		 * 도움말 
		 * %o : 8진수 
		 * %x : 16진수(소문자)
		 * %X : 16진수(대문자)
		 */
		
		
		System.out.printf("%o %X",a,a);

		
		
		
		sc.close();

	}

}

