package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int k = 0;
		
		for(int i = 1; i <= a; i++) {
			if(i%2 == 0) {
				k = k + i;
			}
		}
		System.out.println(k);
		
		
		sc.close();

	}

}
