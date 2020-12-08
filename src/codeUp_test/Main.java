package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = 2012 - (a - 1);
		int c = 0;
		
		if(b >= 2000) {
			c = b - 2000;
			System.out.printf("%d 3",c);
		}
		if(b < 2000) {
			c = b - 1900;
			System.out.printf("%d 1",c);
		}
		
		

		sc.close();

	}

}
