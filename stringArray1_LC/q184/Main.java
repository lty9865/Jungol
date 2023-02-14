package q184;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                System.out.print(Character.toLowerCase(str.charAt(i)));
            } else if (Character.isDigit(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
