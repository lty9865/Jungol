package q1314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int[] num = new int[n * n];
		int num1 = 65;
		for (int i = 0; i < num.length; i++) {
			if (num1 == 91) {
				num1 = 65;
			}
			num[i] = num1++;
		}
		int num2 = n * 2 - 1;
		int num3 = 1;

		for (int j = 0; j < n; j++) {
			int count = 0;
			for (int i = 0; i < n; i++) {
				System.out.print((char) num[count + j] + " ");
				if (count == 0 || count % 2 == 0) {
					count += num2;
				} else {
					count += num3;
				}
			}
			System.out.println();
			num2 -= 2;
			num3 += 2;
		}
	}
}
