package q9092;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public void inputPrint(int num[]) {
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] num = new int[6];
        Main main = new Main();
        main.inputPrint(num);
    }
}
