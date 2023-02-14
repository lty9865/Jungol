package q185;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        sc.close();

        int count = str.indexOf(c);
        if (count >= 0) {
            System.out.println(count);
        } else {
            System.out.println("No");
        }
    }
}
