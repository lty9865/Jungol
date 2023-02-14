package q9102;

import java.util.Scanner;

public class Main {
    private int N;

    Main(int N) {
        this.N = N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        new Main(N).print(0);
    }

    public void print(int num) {
        if (num == N) {
            return;
        }
        System.out.print(num + 1 + " ");
        print(num + 1);
    }
}
