package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String c = sc.next();
		String cs = c.substring(0, 2);
		System.out.println(cs);
		int a = Integer.parseInt(cs);
		int b = sc.nextInt();
		int d = 0;

		if (b == 1 || b == 2) {
			d = 2012 - (1900 + a-1);
			System.out.println(d);
		} else if (b == 3 || b == 4) {
			d = 2012 - (2000 + a-1);
			System.out.println(d);
		}

		sc.close();

	}

}
