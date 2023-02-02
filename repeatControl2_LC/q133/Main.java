package q133;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        float result = 0;
        for (int i = 0; i < n; i++) {
            result += sc.nextInt();
        }
        result = result / n;
        System.out.printf("%.2f", result);
    }
}
