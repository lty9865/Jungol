package q602;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            al.add(sc.next());
        }
        sc.close();

        ListIterator<String> listIterator = al.listIterator(al.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
