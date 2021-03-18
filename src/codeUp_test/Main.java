package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Long a = sc.nextLong();
		Long b = sc.nextLong();
		int c = sc.nextInt();
		
		Long[] I = new Long[c+1];
		
		for(int i = 0; i < I.length-1; i++) {
			I[0] = a;
			I[i+1] = I[i]*b;
		}
		//int형으로 하면 담을 수 있는 범위를 초과해버림
		//따라서, int보다 큰 범위까지 커버가 가능한
		//long형으로 배열을 만들어야 함
		
		System.out.println(I[c-1]);
		
	
		sc.close();

	}

}
