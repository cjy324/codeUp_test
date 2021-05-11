package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		String y1 = x.substring(0,1);
		String y2 = x.substring(1,2);
		String y3 = x.substring(2,3);
		String y4 = x.substring(3,4);
		String y5 = x.substring(4);
		
		System.out.printf("[%s0000]\n", y1);
		System.out.printf("[%s000]\n", y2);
		System.out.printf("[%s00]\n", y3);
		System.out.printf("[%s0]\n", y4);
		System.out.printf("[%s]\n", y5);


		sc.close();
	}
}
