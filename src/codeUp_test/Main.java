package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		int month = sc.nextInt();
	
		int day = 0;
		
		if(month == 1) {
			day = 31;
			System.out.println(day);
		}
		else if(month == 2) {
			if(year%400 == 0 || ((year%4 == 0) && (year%100 != 0))) {
				day = 29;
			}
			else {
				day = 28;
			}
			System.out.println(day);
		}
		else if(month == 3) {
			day = 31;
			System.out.println(day);
		}
		else if(month == 4) {
			day = 30;
			System.out.println(day);
		}
		else if(month == 5) {
			day = 31;
			System.out.println(day);
		}
		else if(month == 6) {
			day = 30;
			System.out.println(day);
		}
		else if(month == 7) {
			day = 31;
			System.out.println(day);
		}
		else if(month == 8) {
			day = 31;
			System.out.println(day);
		}
		else if(month == 9) {
			day = 30;
			System.out.println(day);
		}
		else if(month == 10) {
			day = 31;
			System.out.println(day);
		}
		else if(month == 11) {
			day = 30;
			System.out.println(day);
		}
		else if(month == 12) {
			day = 31;
			System.out.println(day);
		}
	
		

		

		sc.close();

	}

}
