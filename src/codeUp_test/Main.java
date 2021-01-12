package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int notAd = sc.nextInt(); //1
		int doAd = sc.nextInt(); //3
		int payAd = sc.nextInt(); //1
		
		if(notAd > (doAd-payAd)) {
			System.out.println("do not advertise");
		}
		if((doAd-payAd) > notAd) {
			System.out.println("advertise");
		}
		if((doAd-payAd) == notAd) {
			System.out.println("does not matter");
		}
		
		sc.close();

	}

}
