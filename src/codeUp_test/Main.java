package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

	//	float b = 9/5*a+32;   => 62.000 나옴
		
		/*
		 * 9 / 5는 정수 / 정수 형태로서 결과 값도 정수를 취하게 됩니다. 
		 * 우리가 생각한 숫자1.8이 나오지 않고 1이 나온다는 이야기입니다.
		 * (정수형 계산에서 소수점이하는 버림) 
		 * 그러니 제대로 된 답이 나오지 않습니다.
		 * 그럼 1.8이 나오게 하려면 어떻게 해야 할까요?
		 */
		
		float b = (float)9/5*a+32;

		System.out.printf("%.3f",b);

		
		
		
		sc.close();

	}

}

