package q152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int odd = 0;
        int even = 0;
        for (int i = 1; i <= arr.length; i++) {
            if (i % 2 != 0) {
                odd += arr[i-1];
            } else {
                even += arr[i-1];
            }
        }

        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }
}
