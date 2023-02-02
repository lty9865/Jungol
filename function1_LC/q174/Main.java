package q174;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[3][3];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int sum;
        for (int i = 0; i < score.length; i++) {
            sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + " ");
                sum += score[i][j];
            }
            System.out.print(sum);
            System.out.println();
        }

        int result = 0;
        for (int i = 0; i < score.length; i++) {
            sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                sum += score[j][i];
            }
            result += sum;
            System.out.print(sum + " ");
        }
        System.out.println(result);
    }
}
