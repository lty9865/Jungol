package q1307;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sqLength = sc.nextInt();
        sc.close();
        char[] ch = new char[sqLength * sqLength];
        char c = 'A';
        for (int i = 0; i < ch.length; i++) {
            if (c > 'Z') {
                c = 'A';
            }
            ch[i] = c++;
        }

        for (int i = 0; i < sqLength; i++) {
            for (int j = 0; j < sqLength; j++) {
                System.out.print(ch[((ch.length - 1) - i) - (j * sqLength)] + " ");
            }
            System.out.println();
        }
    }
}
