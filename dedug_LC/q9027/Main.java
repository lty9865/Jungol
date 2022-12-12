package q9027;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		sc.close();

		// 두 수의 합을 정수로 변환
		int res1 = (int) (num1 + num2);

		// 두 수를 각각 정수로 변환 후 합산
		int res2 = (int) num1 + (int) num2;

		System.out.print(res1 + " " + res2);
	}
}
