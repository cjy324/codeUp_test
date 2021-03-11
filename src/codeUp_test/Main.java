package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double h = sc.nextDouble();
		double w = sc.nextDouble();
		
		//표준 몸무게
		double sW = (h - 100)*0.9;
		
		//비만도
		double fW = (w - sW)*100/sW;
		
		if(fW <= 10) {
			System.out.println("정상");
		}
		if(fW > 10 && fW <= 20) {
			System.out.println("과체중");
		}
		if(fW > 20) {
			System.out.println("비만");
		}
		
		sc.close();

	}

}
