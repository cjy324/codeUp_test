package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		
		String a1 = "";
		String b1 = "";
		
		if(a%2 == 0) {
			a1 = "짝수";
		}
		else if(a%2 != 0){
			a1 = "홀수";
		}
		if(b%2 == 0) {
			b1 = "짝수";
		}
		else if(b%2 != 0){
			b1 = "홀수";
		}
		if((a1.equals("홀수") && b1.equals("짝수")) || (a1.equals("짝수") && b1.equals("홀수"))){
			System.out.println(a1+"+"+b1+"="+"홀수");
		}
		else{
			System.out.println(a1+"+"+b1+"="+"짝수");
		}

				
		sc.close();

	}

}

