package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//double : 자연수
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		double A = a/b;
		double B = c/d;
		
		if(A > B) {
			System.out.println(">");
		}
		if(A == B) {
			System.out.println("=");
		}
		if(A < B) {
			System.out.println("<");
		}
		

		sc.close();

	}

}
