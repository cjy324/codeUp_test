package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//n,m < 10
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k <= m; k++) {
				System.out.printf("%d %d\n", i,k);
			}
		}

		
		sc.close();
	}
}
