package q173;

import java.util.Scanner;

public class Main {

	public int multiple(int num1, int num2) {
		if (num1 > num2) {
			return (num1 * num1) - (num2 * num2);
		} else {
			return (num2 * num2) - (num1 * num1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		Main m = new Main();
		int result = m.multiple(num1, num2);
		System.out.println(result);
	}
}
