package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.printf("%d",a);
		if(b < 10) {
			System.out.printf("0%d",b);
		}
		else if(b >= 10) {
			System.out.printf("%d",b);
		}
		if(c < 10) {
			System.out.printf("00%d",c);
		}
		else if(c >= 10 && c < 100) {
			System.out.printf("0%d",c);
		}
		else if(c >= 100) {
			System.out.printf("%d",c);
		}
		
		

		sc.close();

	}

}
