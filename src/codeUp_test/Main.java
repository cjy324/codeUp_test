package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextInt();
		long b = sc.nextInt();
		
		long p = a+b;
		long m1 = a-b;
		long m2 = b-a;
		long mu = a*b;
		long d1 = a/b;
		long d2 = b/a;
		long s1 = (long) Math.pow(a, b);
		long s2 = (long) Math.pow(b, a);
		
		long x = 0;
		
		while(true) {
			if(p < m1) {
				x = m1;
				System.out.println(x);
			}
			
			else {
				x = p;
				System.out.println(x);
			}
			if(x < m2) {
				x = m2;
				System.out.println(x);
			}
			if(x < mu) {
				x = mu;
				System.out.println(x);
			}
			if(x < d1) {
				x = d1;
				System.out.println(x);
			}
			if(x < d2) {
				x = d2;
				System.out.println(x);
			}
			break;
		}
		
		
		sc.close();

	}

}
