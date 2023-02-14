package q199;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person {
    private String name;
    private int score1, score2, score3, sum;

    public Person(String name, int score1, int score2, int score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.sum = score1 + score2 + score3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public int getScore3() {
        return score3;
    }

    public void setScore3(int score3) {
        this.score3 = score3;
    }

    public int getSum() {
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Person[] person = new Person[num];

        for (int i = 0; i < num; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            person[i] = new Person(name, score1, score2, score3);
        }
        sc.close();
        new Main().sort(person);

        for (int i = 0; i < num; i++) {
            System.out.printf("%s %d %d %d %d\n",person[i].getName(),person[i].getScore1(),person[i].getScore2(),person[i].getScore3(),person[i].getSum());
        }
    }

    public void sort(Person person[]) {
        Arrays.sort(person, Comparator.comparingInt(Person::getSum).reversed());
    }
}
