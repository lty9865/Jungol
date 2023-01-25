package q1339;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		// 문자 배열
		int[] arr = new int[N * N];
		int num1 = 65;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (num1 == 91) {
				num1 = 65;
			}
			arr[i] = num1++;
		}

		// 문자 삼각형
		float num2 = N;
		int num3 = Math.round(num2 / 2);

		int sum = 0;
		int num4 = 0;
		for (int i = 1; i < num3; i++) {
			sum += num4++ + 1;
			num4++;
		}
		System.out.println(sum);

		int count = 1;
		boolean bool = true;
		for (int i = 0; i < N; i++) {
			int count2 = 0;
			int count3 = 2;
			for (int j = 0; j < count; j++) {
				count3 += 2;
				System.out.print((char) arr[i + sum - count2] + " ");
				count2 = sum / 2 + count3;
			}
			if (bool) {
				count++;
				if (count == num3) {
					bool = false;
				}
			} else {
				count--;
			}
			System.out.println();
		}
	}
}
