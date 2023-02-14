package q9101;

public class Main {
    public static void main(String[] args) {
        new Main().print(0);
    }

    public void print(int num) {
        if (num == 10) {
            return;
        }
        System.out.println("홍길동");
        print(num + 1);
    }
}
