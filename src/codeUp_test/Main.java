package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a >= b && a >= c && b >= c) {
			System.out.println(b);
		}
		else if(a >= b && a >= c && b <= c) {
			System.out.println(c);
		}
		else if(b >= a && b >= c && a >= c) {
			System.out.println(a);
		}
		else if(b >= a && b >= c && a <= c) {
			System.out.println(c);
		}
		else if(c >= a && c >= b && a >= b) {
			System.out.println(a);
		}
		else if(c >= a && c >= b && a <= b) {
			System.out.println(b);
		}
		
		sc.close();

	}

}
