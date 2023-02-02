package q139;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        boolean b = (num1 - num2) < 0;
        for (int i = 1; i <= 9; i++) {
            if (b) {
                for (int j = num1; j <= num2; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
            } else {
                for (int j = num1; j >= num2; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
            }
            System.out.println();
        }
    }
}
