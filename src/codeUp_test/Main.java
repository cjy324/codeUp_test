package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		if(a!=1 && b!=1) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		
		sc.close();

	}

}

