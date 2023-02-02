package q599;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        a = a.toUpperCase();
        sc.close();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isAlphabetic(c)) {
                System.out.print(c);
            }
        }
    }
}
