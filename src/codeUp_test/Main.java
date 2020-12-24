package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		
		if(b%a == 0 && b >= a) {
			c = b/a;
			System.out.println(a + "*" + c + "=" + b);
		}
		if(a%b == 0 && b < a) {
			c = a/b;
			System.out.println(b + "*" + c + "=" + a);
		}
		else if(b%a != 0 && a%b != 0){
			System.out.println("none");
		}
		

			
			
		
		
		sc.close();

	}

}
