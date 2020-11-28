package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		float f =(float)(((a*b*c*d)/8)/1024)/1024;
		   //크기가 더 큰 타입을 작은 타입으로 바꿀 때는 명시적으로 변환해주어야 함
		
		System.out.printf("%.1f MB",f);
		
		
		
		sc.close();

	}

}

