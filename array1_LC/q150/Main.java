package q150;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] st = sc.nextLine().split(" ");

        for (int i = st.length - 1; i >= 0; i--) {
            System.out.print(st[i] + " ");
        }
    }
}
