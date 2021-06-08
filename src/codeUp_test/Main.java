package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		if(m < 45) {
			h--;
			if(h < 0) {
				h = 23;
			}
			m = 60 - (45 - m);
			System.out.printf("%d %d", h, m);
		}
		else {
			System.out.printf("%d %d", h, m-45);
		}
		
	}
}
