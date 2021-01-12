package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int aCal = 0;
		int bCal = 0;
		
		
		if(a == 1) {
			aCal = 400;
		}
		else if(a == 2) {
			aCal = 340;
		}
		else if(a == 3) {
			aCal = 170;
		}
		else if(a == 4) {
			aCal = 100;
		}
		else if(a == 5) {
			aCal = 70;
		}
		
		
		if(b == 1) {
			bCal = 400;
		}
		else if(b == 2) {
			bCal = 340;
		}
		else if(b == 3) {
			bCal = 170;
		}
		else if(b == 4) {
			bCal = 100;
		}
		else if(b == 5) {
			bCal = 70;
		}
		

		int sumCal = aCal + bCal;
		
		if(sumCal > 500) {
			System.out.println("angry");
		}
		else if(sumCal <= 500) {
			System.out.println("no angry");
		}
		

		sc.close();

	}

}
