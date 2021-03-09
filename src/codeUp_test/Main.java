package codeUp_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//로또 당첨번호 + 보너스 번호
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		
		//주희가 가진 로또 번호
		int h = sc.nextInt();
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		int m = sc.nextInt();

		List<Integer> ints = new ArrayList<>(); 
		ints.add(a);
		ints.add(b);
		ints.add(c);
		ints.add(d);
		ints.add(e);
		ints.add(f);

		List<Integer> newInts = new ArrayList<>();
		for(int t = 0; t < ints.size()-1; t++) {
			
			if(ints.get(t) == h) {
				newInts.add(h);
			}
			if(ints.get(t) == i) {
				newInts.add(i);
			}
			if(ints.get(t) == j) {
				newInts.add(j);
			}
			if(ints.get(t) == k) {
				newInts.add(k);
			}
			if(ints.get(t) == l) {
				newInts.add(l);
			}
			if(ints.get(t) == m) {
				newInts.add(m);
			}
			newInts.add(g);
		}
		
		int rs = 0;
		
		for(int y = 0; y < newInts.size(); y++) {
			if(newInts.get(y) == g) {
				rs = 1;
			}

		}
		
		if(newInts.size() <= 2) {
			System.out.println("0");
		}
		if(newInts.size() == 3) {
			System.out.println("5");
		}
		if(newInts.size() == 4) {
			System.out.println("4");
		}
		if(newInts.size() == 5 && rs == 0) {
			System.out.println("3");
		}
		if(newInts.size() == 5 && rs == 1) {
			System.out.println("2");
		}
		if(newInts.size() == 6) {
			System.out.println("1");
		}

		/* 이거에서 막힘
		 1 5 9 14 15 16 7
		1 5 7 9 14 15
		
		정답 = 2
		내 결과 = 3
		 */
		
		sc.close();

	}

}
