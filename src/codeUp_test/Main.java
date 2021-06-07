package codeUp_test;

public class Main {

	public static void main(String[] args) {
	}
}

class Test {
	long sum(int[] a) {
		
		long x = 0;
		
		for(int i = 0; i < a.length; i++) {
			x += a[i];
		}
		return x;
	}
}