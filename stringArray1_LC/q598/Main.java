package q598;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char c = sc.next().charAt(0);

            if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')) {
                System.out.println(c);
            } else if ('0' <= c && c <= '9') {
                System.out.println((int) c);
            } else {
                sc.close();
                break;
            }
        }
    }
}
