package q618;

import java.util.Arrays;
import java.util.Scanner;

class Student {
	private String name;
	private int height;
	private double weight;

	public Student(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public void print() {
		System.out.printf("%s %d %.1f\n", getName(), getHeight(), getWeight());
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stu = new Student[5];
		String[] nArr = new String[5];
		double[] dArr = new double[5];

		for (int i = 0; i < stu.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			stu[i] = new Student(name, height, weight);
			nArr[i] = name;
			dArr[i] = weight;
		}
		sc.close();

		// 이름 순
		Arrays.sort(nArr);
		System.out.println("name");
		for (int i = 0; i < stu.length; i++) {
			for (int j = 0; j < nArr.length; j++) {
				if (nArr[i].equals(stu[j].getName())) {
					stu[j].print();
				}
			}
		}
		System.out.println();

		// 몸무게 순
		Arrays.sort(dArr);
		System.out.println("weight");
		for (int i = stu.length - 1; i >= 0; i--) {
			for (int j = 0; j < nArr.length; j++) {
				if (dArr[i] == stu[j].getWeight()) {
					stu[j].print();
				}
			}
		}
	}
}