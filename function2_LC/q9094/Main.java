package q9094;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("두 정수의 차 : " + Math.abs(num1 - num2));

        float num3 = sc.nextFloat();
        float num4 = sc.nextFloat();
        System.out.printf("두 실수의 차 : %.6f",Math.abs(num3 - num4));
        sc.close();
    }
}
