package codeUp_test;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();  //케이스 수
		
		int[] Xs;
		
		for(int i = 0; i < x; i++) {
			int N = sc.nextInt(); // 각 케이스별 학생 수
			Xs = new int[N];
			double sum = 0;
			double avg;
			
			for(int k = 0; k < N; k++) {
				Xs[k] = sc.nextInt();
				sum += Xs[k];
			}
			
			avg = sum/N;
			double head = 0;
			for(int l = 0; l < N; l++) {
				if(Xs[l] > avg) {
					head++;
				}
			}
			System.out.printf("%.3f%%\n",(head/N)*100);
			
		}




		sc.close();
	}
}
