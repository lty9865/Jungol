package q151;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split(" ");
        sc.close();

        int sum = 0;
        for (int i = 1; i <= num.length; i++) {
            if (i % 2 != 0) {
                sum += Integer.parseInt(num[i-1]);
            }
        }
        System.out.println(sum);
    }
}
