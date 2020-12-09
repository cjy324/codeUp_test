package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if(a <= 10) {
			System.out.println("정상");
		}
		if(a > 10 && a <=20) {
			System.out.println("과체중");
		}
		if(a > 20) {
			System.out.println("비만");
		}



		
		
		sc.close();

	}

}
