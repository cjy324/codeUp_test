package codeUp_test;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		long x = a;
		
		for(int i = 1; i < n; i++) {
			x = (x*m)+d;
		}
		System.out.println(x);

		sc.close();
	}
}
