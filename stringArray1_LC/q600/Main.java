package q600;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();
        int count = 1;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == ' ') {
                count++;
            }
        }

        StringTokenizer st = new StringTokenizer(a);
        count = st.countTokens();

        System.out.println(count);
    }
}
