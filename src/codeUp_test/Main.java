package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(c < 10) {
			System.out.printf("%d%d0%d",a,b,c);
		}
		if(c >= 10) {
			System.out.printf("%d%d%d",a,b,c);
		}
		
		

		sc.close();

	}

}
