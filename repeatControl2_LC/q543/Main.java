package q543;

import java.util.Scanner;

public class Main {
	private int num;

	Scanner sc = new Scanner(System.in);

	public Main() {
		this.num = sc.nextInt();
		sc.close();
	}

	public int getNum() {
		return num;
	}

	public void print() {
		for (int i = 1; i <= getNum(); i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.print();
	}
}
