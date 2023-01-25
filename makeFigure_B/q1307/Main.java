package q1307;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 65~90 A~Z

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
		for (int i = 0; i < n; i++) {
			int num2 = 1;
			for (int j = 0; j < n; j++) {
				System.out.print((char) (num[num.length - i - num2]) + " ");
				num2 += n;
			}
			System.out.println();
		}
	}
}
