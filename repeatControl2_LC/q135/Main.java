package q135;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        if (num1 > num2) {
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }

        int sum = 0;
        float avg = 0;
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                count++;
            }
        }
        avg = (float) sum / count;
        System.out.printf("sum : %d\navg : %.1f", sum, avg);
    }
}
