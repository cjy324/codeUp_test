package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
	//	int b = sc.nextInt();
	//	float c = sc.nextFloat();
		
		if(a<60) {
			System.out.printf("1 %d",a);
		}
		else if(a==60) {
			System.out.println("1 00");
		}
		else if(a>=60) {
			int b = a-60
			System.out.println("1 00");
		}
		
		System.out.println();

		
		
		
		sc.close();

	}

}

