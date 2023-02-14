package q588;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        new Main().print(N);
    }

    public void print(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        print(num - 1);
    }
}
