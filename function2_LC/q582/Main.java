package q582;

import java.util.Scanner;

public class Main {
    private float weight;

    Main(float weight) {
        this.weight = weight;
    }

    public void radius() {
        System.out.printf("%.2f", Math.sqrt(weight / 3.14));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float weight = sc.nextInt();
        sc.close();

        new Main(weight).radius();
    }
}
