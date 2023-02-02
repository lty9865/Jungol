package q1339;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        char c = 'A';

        for (int i = 1; i <= N / 2 + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c++ + " ");
                if (c > 'Z') {
                    c = 'A';
                }
            }
            System.out.println();
        }
        for (int i = N / 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(c++ + " ");
                if (c > 'Z') {
                    c = 'A';
                }
            }
            System.out.println();
        }
    }
}
