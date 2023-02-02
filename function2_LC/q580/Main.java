package q580;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        sc.close();

        Calendar cal = Calendar.getInstance();
        cal.set(2016, month - 1, 1);
        int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        if (day <= 0 || day > maxDay || month > 12 || month < 0) {
            System.out.println("BAD!");
        } else {
            System.out.println("OK!");
        }
    }
}
