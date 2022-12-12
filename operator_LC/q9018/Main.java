package q9018;

import java.util.Scanner;

public class Main {
	private int num1;
	private int num2;

	public Main() {
		Scanner sc = new Scanner(System.in);
		this.num1 = sc.nextInt();
		this.num2 = sc.nextInt();
		sc.close();
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public void print() {
		System.out.printf("%d + %d = %d\n", getNum1(), getNum2(), getNum1() + getNum2());
		System.out.printf("%d - %d = %d\n", getNum1(), getNum2(), getNum1() - getNum2());
		System.out.printf("%d * %d = %d\n", getNum1(), getNum2(), getNum1() * getNum2());
		System.out.printf("%d / %d = %d\n", getNum1(), getNum2(), getNum1() / getNum2());
		System.out.println(getNum1() + " % " + getNum2() + " = " + getNum1() % getNum2());
	}

	public static void main(String[] args) {
		System.out.print("두 개의 수를 입력하시오. ");
		Main m = new Main();
		m.print();
	}
}
