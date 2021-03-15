package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int k = 0;
		
		for(int i = 1; i <= a; i++) {
			k = k + i;
			if(k >= a) {
				System.out.println(k);
				break;
			}
		}

		sc.close();

	}

}
