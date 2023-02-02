package q546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        float result = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            result += a;
        }
        sc.close();
        result = result / n;
        System.out.printf("avg : %.1f\n", result);
        if (result >= 80) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
