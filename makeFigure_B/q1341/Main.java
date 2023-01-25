package q1341;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int num2 = 0;
			boolean b = (s - e) < 0;
			for (int k = 0; k <= Math.abs(s - e); k++) {
				int num1 = 1;
				for (int j = 0; j < 3; j++) {
					for (int i = 1; i <= 3; i++) {
						System.out.printf("%d * %d = %2d   ", (s + num2), num1, (s + num2) * num1);
						num1++;
					}
					System.out.println();
				}
				System.out.println();
				if (b) {
					num2 += 1;
				} else {
					num2 -= 1;
				}
			}
			break;
		}
		sc.close();
	}
}
