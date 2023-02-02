package q9093;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[3];

        boolean fail = false;
        float avg = 0;

        System.out.print("3과목의 점수를 입력하세요. ");
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }

        for (int i : score) {
            if (i < 40) {
                fail = true;
            }
            avg += i;
        }
        avg = avg / score.length;
        if (avg < 60 || fail) {
            System.out.println("불합격");
        } else {
            System.out.println("축하합니다. 합격입니다.");
        }
    }
}
