package q546;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int score = 0;
        for (int i = 0; i < n; i++) {
            score += sc.nextInt();
        }
        sc.close();

        float avg = (float) score / n;
        System.out.printf("avg : %.1f\n", avg);
        if (avg >= 80) {
            System.out.print("pass");
        } else {
            System.out.print("fail");
        }
    }
}
