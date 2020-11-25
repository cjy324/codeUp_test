package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int select = sc.nextInt();

		Gas[] gases = new Gas[size];

		for (int i = 0; i < size; i++) {
			Gas gas = new Gas();
			gas.name = sc.next();
			gas.score = sc.nextInt();

			gases[i] = gas;
		}

		sc.close();

		System.out.println();

		Gas gas;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (gases[j].score > gases[j + 1].score) {
					gas = gases[j];
					gases[j] = gases[j + 1];
					gases[j + 1] = gas;
				}
			}
		}



		for (int i = select; i > 0; i--) {

			gases[i].정답();
		}

	}

}

class Gas {
	public String name;
	public int score;

	void 정답() {
		System.out.printf("%s\n", name);
	}
}
