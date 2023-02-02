package PracticeQ;

import java.util.Scanner;

public class Main {
    private int side;
    private int[] num;

    Main(int side, int num) {
        this.side = side;
        this.num = new int[num];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int num = sc.nextInt();
        sc.close();

        Main main = new Main(side, num);
        main.setArray(0, 0);
    }

    public void setArray(int a, int b) {
        if (b < this.num.length) {
            num[b] = a + 1;
            System.out.print(num[b]);
            setArray(a, b + 1);
        }
    }
    public void print(int a, int b){
        if(num[0] > side){
            return;
        }
    }
}
