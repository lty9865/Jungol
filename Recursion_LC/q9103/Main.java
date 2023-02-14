package q9103;

import java.util.Scanner;

public class Main {
    private int N;
    private int sum = 1;

    Main(int N) {
        this.N = N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        new Main(N).factorial(0);
    }

    public void factorial(int num) {
        if (num == N) {
            System.out.println(sum);
            return;
        }
        sum *= num + 1;
        factorial(num + 1);
    }
}
