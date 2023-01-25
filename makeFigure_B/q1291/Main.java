package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			if ((s < 2 || s > 9) || (e < 2 || e > 9)) {
				System.out.println("INPUT ERROR!");
			} else {
				boolean b = (s - e) < 0;
				for (int i = 1; i <= 9; i++) {
					int num1 = 0;
					for (int j = 0; j <= Math.abs(s - e); j++) {
						System.out.printf("%d * %d = %2d   ", (s + num1), i, (s + num1) * i);
						if (b) {
							num1 += 1;
						} else {
							num1 -= 1;
						}
					}
					System.out.println();
				}
				break;
			}
		}
		sc.close();
	}
}
