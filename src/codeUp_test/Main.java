package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if(a%10 == 1 && a != 11) {
			System.out.println(a+"st");
		}
		else if(a%10 == 2 && a != 12) {
			System.out.println(a+"nd");
		}
		else if(a%10 == 3 && a != 13) {
			System.out.println(a+"rd");
		}
		else {
			System.out.println(a+"th");
		}
		
		
		sc.close();

	}

}
