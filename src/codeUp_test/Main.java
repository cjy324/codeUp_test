package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = b - 30;
		int d = 0;
		
		if(c < 0) {
			d = a - 1;
			if(d < 0) {
				d=d+24;
			}
			c = c+60;
			System.out.printf("%d %d",d ,c);
		}
		else if(c >= 0) {
			d = a;
			System.out.printf("%d %d",d ,c);
		}
		
		sc.close();

	}

}
