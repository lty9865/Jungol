package q9041;

import java.util.Scanner;

public class Main {
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void print() {
		System.out.print("점수를 입력하세요. ");
	}

	public void division() {
		if (getScore() >= 80) {
			System.out.println("축하합니다. 합격입니다.");
		} else {
			System.out.println("죄송합니다. 불합격입니다.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		while (true) {
			m.print();
			m.setScore(sc.nextInt());
			if (m.getScore() < 0 || m.getScore() > 100) {
				sc.close();
				break;
			}
			m.division();
		}
	}
}
