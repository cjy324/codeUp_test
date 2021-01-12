package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();


		//일반 삼각형 성립 조건
		if (a >= b && a >= c) {
			if (a < (b + c)) {
				//정삼각형
				if(a == b && b == c && a == c){
					System.out.println("정삼각형");
				}
				//이등변삼각형
				else if(((a == b) && a != c) || ((a == c) && b != c) || ((b == c) && a != c)) {
					System.out.println("이등변삼각형");
				}
				//직각삼각형
				else if(((a*a) + (b*b)) == (c*c) || ((a*a) + (c*c)) == (b*b) || ((c*c) + (b*b)) == (a*a)) {
					System.out.println("직각삼각형");
				}
				else {
				System.out.println("삼각형");
				}
			}
			else {
				System.out.println("삼각형아님");
			}
		} else if (b >= a && b >= c) {
			if (b < (a + c)) {
				//정삼각형
				if(a == b && b == c && a == c){
					System.out.println("정삼각형");
				}
				//이등변삼각형
				else if(((a == b) && a != c) || ((a == c) && b != c) || ((b == c) && a != c)) {
					System.out.println("이등변삼각형");
				}
				//직각삼각형
				else if(((a*a) + (b*b)) == (c*c) || ((a*a) + (c*c)) == (b*b) || ((c*c) + (b*b)) == (a*a)) {
					System.out.println("직각삼각형");
				}
				else {
				System.out.println("삼각형");
				}
			}
			else {
				System.out.println("삼각형아님");
			}
		} else if (c >= a && c >= b) {
			if (c < (a + b)) {
				//정삼각형
				if(a == b && b == c && a == c){
					System.out.println("정삼각형");
				}
				//이등변삼각형
				else if(((a == b) && a != c) || ((a == c) && b != c) || ((b == c) && a != c)) {
					System.out.println("이등변삼각형");
				}
				//직각삼각형
				else if(((a*a) + (b*b)) == (c*c) || ((a*a) + (c*c)) == (b*b) || ((c*c) + (b*b)) == (a*a)) {
					System.out.println("직각삼각형");
				}
				else {
				System.out.println("삼각형");
				}
			}
			else {
				System.out.println("삼각형아님");
			}
		}

		

		sc.close();

	}

}
