package q581;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (Math.abs(num1) > Math.abs(num2)) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
        float num3 = sc.nextFloat();
        float num4 = sc.nextFloat();
        sc.close();

        if (Math.abs(num3) > Math.abs(num4)) {
            System.out.printf("%.2f",num4);
        } else {
            System.out.printf("%.2f",num3);
        }
    }
}
