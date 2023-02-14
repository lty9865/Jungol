package q9104;

import java.util.Scanner;

public class Main {
    private String N;
    private int sum;

    Main(String N) {
        this.N = N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        sc.close();
        new Main(N).sumNum(0);
    }

    public void sumNum(int num) {
        if (num == N.length()) {
            System.out.print(sum);
            return;
        }
        sum += Integer.parseInt(String.valueOf(N.charAt(num)));
        sumNum(num + 1);
    }
}
