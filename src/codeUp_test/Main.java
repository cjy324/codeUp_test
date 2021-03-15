package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] A = a.split(" ");
		
		for(int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
			
			if(A[i].equals("q")) {
				break;
			}
		}

		sc.close();

	}

}
