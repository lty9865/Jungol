package q1338;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int[] arr = new int[N * N];
		int num2 = 65;
		for (int i = 0; i < arr.length; i++) {
			if (num2 == 91) {
				num2 = 65;
			}
			arr[i] = num2++;
		}
		int count = N - 1;
		for (int i = 0; i < N; i++) { // 5번
			int num = 0;
			int minus = 1;
			for (int j = 0; j < N; j++) { // 5번
				if (j < count) {
					System.out.print("  ");
				} else {
					System.out.print((char) arr[i + num] + " ");
					num += (N - minus++);
				}
			}
			System.out.println();
			count--;
		}
	}
}