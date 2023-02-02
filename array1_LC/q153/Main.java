package q153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            int inp = sc.nextInt();
            if (inp == -1) {
                sc.close();
                break;
            } else {
                num[i] = inp;
                count++;
            }
        }

        int a = 0;
        if (count > 3) {
            a = count - 3;
        }
        for (int i = a; i < count; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
