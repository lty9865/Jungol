package q1175;

import java.util.Scanner;

public class Main {
    private int[] arr;
    private int N;
    private int M;

    Main(int N, int M) {
        this.arr = new int[N];
        this.N = N;
        this.M = M;
    }

    public void dice(int x) {
        if (x == N) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            if (sum == M) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            return;
        }
        for (int i = 1; i <= 6; i++) {
            arr[x] = i;
            dice(x + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        // (1,1,1),(1,1,2)...(1,2,1),(1,2,2)...(6,6,6)

        Main m = new Main(N, M);
        m.dice(0);
    }
}
