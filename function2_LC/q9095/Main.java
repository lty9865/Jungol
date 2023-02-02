package q9095;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        System.out.println("정사각형의 넓이 : " + weight);
        Main m = new Main();
        System.out.println("정사각형의 한 변의 길이 : " + m.sqLength(weight));
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("밑과 지수 : " + num1 + " " + num2);
        float result = 0;
        for (int i = 0; i < num2; i++) {
            result += (num1 * num1);
        }
        System.out.printf("%.6f의 %.6f승은 %.6f입니다.");

    }

    public int sqLength(int weight) {
        return weight / weight;
    }
}
