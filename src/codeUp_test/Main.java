package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		int count = 1;
		
		sc.close();

		while(true) {
			if(count == n) {
				System.out.println(a);
				break;
			}
			a = a*r;
			count++;
		}


	}
}
