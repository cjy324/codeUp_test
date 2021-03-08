package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int as = 1;

		if (t % 2 == 0) {
			t = ((90 - t) / 5);
		} else {
			t = ((90 - t) / 5) + 1;
		}

		as = as * t;
		a = a + as;

		if (a > b) {
			System.out.println("win");
		}
		if (a == b) {
			System.out.println("same");
		}
		if (a < b) {
			System.out.println("lose");
		}

		sc.close();

	}

}
