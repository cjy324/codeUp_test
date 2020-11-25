package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		int size = sc.nextInt();
		Gas[] gases = new Gas[size];
		
		for(int i = 0; i < size; i++) {
			Gas gas = new Gas();
			gas.id = sc.nextInt();
			gas.gas = sc.nextInt();
			
			gases[i] = gas;
		}
		
		
		

		sc.close();
		Gas b;
		for(int i = 0 ; i < gases.length ; i ++) {
			for(int j = 0 ; j < gases.length -i -1 ; j ++) {
				if(gases[j].id>gases[j+1].id) {
					b = gases[j];
					gases[j] = gases[j+1];
					gases[j+1] = b;
				}
			}
		}
		
		for(int i = 0 ; i < gases.length ; i ++) {
			gases[i].정답();
		}

	}

}

class Gas {
	public int id;
	public int gas;


	void 정답() {
		System.out.printf("%d %d\n", id, gas);
	}
}
