package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		
		String[] X = null;
		int a = 0;
		int b = 0;
		
		if(x.contains("+")) {
			X = x.split("\\+");
			a = Integer.parseInt(X[0]);
			b = Integer.parseInt(X[1]);

			System.out.println(a+b);
		}
		if(x.contains("-")) {
			X = x.split("\\-");
			a = Integer.parseInt(X[0]);
			b = Integer.parseInt(X[1]);

			System.out.println(a-b);
		}
		if(x.contains("*")) {
			X = x.split("\\*");
			a = Integer.parseInt(X[0]);
			b = Integer.parseInt(X[1]);

			System.out.println(a*b);
		}
		if(x.contains("/")) {
			X = x.split("\\/");
			a = Integer.parseInt(X[0]);
			b = Integer.parseInt(X[1]);
			
			float c = (float) a/b;
			
			System.out.printf("%.2f", c);
		}
		
		
		sc.close();

	}

}
