package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		long d = (a + b + c);
		
		if ((d % 100) %2 == 0) {
			System.out.println("그럭저럭");
		} else {
			System.out.println("대박");
		}

		sc.close();

	}

}
