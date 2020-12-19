package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		float p = a+b;
		float m1 = a-b;
		float m2 = b-a;
		float mu = a*b;
		float d1 = a/b;
		float d2 = b/a;
		float s1 = (float) Math.pow(a, b);
		float s2 = (float) Math.pow(b, a);
		
		
		
		float[] array = new float[]{p, m1, m2, mu, d1, d2, s1, s2};
		for(int i = 0; i < array.length; i++) {
			float max = array[i];
			if(array[i] < array[i+1]) {
				max = array[i+1];
			}
			System.out.printf("%.6f",max);
		}
		

			
			
		
		
		sc.close();

	}

}
