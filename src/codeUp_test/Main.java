package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a >= b && a >= c && b >= c) {
			System.out.printf("%d %d %d",c,b,a);
		}
		else if(a >= b && a >= c && b <= c) {
			System.out.printf("%d %d %d",b,c,a);
		}
		else if(b >= a && b >= c && a >= c) {
			System.out.printf("%d %d %d",c,a,b);
		}
		else if(b >= a && b >= c && a <= c) {
			System.out.printf("%d %d %d",a,c,b);
		}
		else if(c >= a && c >= b && b >= a) {
			System.out.printf("%d %d %d",a,b,c);
		}
		else if(c >= a && c >= b && b <= a) {
			System.out.printf("%d %d %d",b,a,c);
		}
		
		
		
		

		sc.close();

	}

}
