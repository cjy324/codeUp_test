package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		b=b+1;  //들어가자마자 득점
		
		for(int i = 0; i < 90; i++) {  //90분 전까지 득점 카운트
			if(i == a+5) { //만약, i값이 들어간 시간에서 5분이 지난값과 같으면
				b = b + 1;  //1득점 추가
				a = a+5;    //다음 득점 가능 시간 설정
			}
			
//			System.out.printf("%d,%d,%d\n",i,b,a);
		}
		
		System.out.println(b);
		
		sc.close();

	}

}
