package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int abcd = a+b+c+d;
		
		if(abcd == 1) {
			System.out.println("도");
		}
		else if(abcd == 2) {
			System.out.println("개");
		}
		else if(abcd == 3) {
			System.out.println("걸");
		}
		else if(abcd == 4) {
			System.out.println("윷");
		}
		else if(abcd == 0) {
			System.out.println("모");
		}

		sc.close();

	}

}
