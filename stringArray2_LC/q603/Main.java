package q603;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split(" ");
        sc.close();

        for (int i = 1; i <= str.length; i++) {
            if (i % 2 != 0)
                System.out.println(str[i-1]);
        }
    }
}
