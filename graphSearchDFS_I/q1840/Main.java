package q1840;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] sq = new int[sc.nextInt()][sc.nextInt()];

        for (int i = 0; i < sq.length; i++) {
            for (int j = 0; j < sq[i].length; j++) {
                sq[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < sq.length; i++) {
            for (int j = 0; j < sq[i].length; j++) {
                System.out.print(sq[i][j] + " ");
            }
            System.out.println();
        }
    }
}
