package q131;

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
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
        }
    }
}
