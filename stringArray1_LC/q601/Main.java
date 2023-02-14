package q601;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();

        for (int i = 0; i < a.length(); i++) {
            int b = a.length() - 1 - i;
            for (int j = 0; j <= i; j++) {
                System.out.print(a.charAt(b++));
            }
            for (int k = 0; k < a.length() - 1 - i; k++) {
                System.out.print(a.charAt(k));
            }
            System.out.println();
        }

    }
}
