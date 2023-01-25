package q545;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M3 = 0;
        int M5 = 0;
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if (a % 3 == 0) {
                M3++;
            }
            if (a % 5 == 0) {
                M5++;
            }
        }
        System.out.println("Multiples of 3 : " + M3);
        System.out.println("Multiples of 5 : " + M5);
    }
}
