package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		for(int k = a; k <= b; k++) {
			for(int i = 1; i <= 9; i++) {
				System.out.println(k + "*" + i + "=" + k*i);
			}
		}

	}
}
