package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		sc.close();
		
		int i = 1;
		int sum = 0;
		while(true) {
			sum += i;
			if(sum >= x) {
				System.out.println(sum);
				break;
			}
			i++;
		}

	}
}
