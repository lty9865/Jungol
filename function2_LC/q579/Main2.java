package q579;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public void sortNum(int[] num) {
        Arrays.sort(num);
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();

        new Main2().sortNum(num);
    }
}
