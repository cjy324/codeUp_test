package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = a.substring(0,1);    //문자열 자르기
		String c = a.substring(1,2);
		int d = Integer.parseInt(c.concat(b));    //문자열 붙이기
		
		//만약 이 알고리즘의 심각한 부작용으로 수치가 100이 넘는다면 100의 자릿수는 무시된다.

		
		
		if(d*2 <= 50) {
			System.out.println(d*2);
			System.out.println("GOOD");	
		}
		else if(d*2 > 100) {
			System.out.println((d*2)-100);
			if((d*2)-100 > 50) {
				System.out.println("OH MY GOD");	
			}
			else if((d*2)-100 <= 50) {
				System.out.println("GOOD");	
			}
		}

		
		
		sc.close();

	}

}
