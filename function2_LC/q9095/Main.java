package q9095;

import java.util.Scanner;

public class Main {
    private int weight;
    private float a,b;
    private float result = 1;

    Main(int weight) {
        this.weight = weight;
    }

    Main(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public void sqLength(float num) {
        if (num * num == weight) {
            System.out.printf("정사각형의 한 변의 길이 : %.6f\n", num);
            return;
        }
        sqLength(num + 1);
    }

    public void Root(int num) {
        if (num == b) {
            System.out.printf("%.6f의 %.6f승은 %.6f입니다.", a, b, result);
            return;
        }
        result *= a;
        Root(num + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정사각형의 넓이 : ");
        int weight = sc.nextInt();
        new Main(weight).sqLength(0);

        System.out.print("밑과 지수 : ");
        float a = sc.nextInt();
        float b = sc.nextInt();
        sc.close();
        new Main(a, b).Root(0);
    }
}
