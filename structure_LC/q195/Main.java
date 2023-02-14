package q195;

import java.util.Scanner;

class Person {
    private String name;
    private String tel;
    private String address;

    public Person(String name, String tel, String address) {
        this.name = name;
        this.tel = tel;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getAddress() {
        return address;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person(sc.next(), sc.next(), sc.next());
        sc.close();

        System.out.println("name : " + person.getName());
        System.out.println("tel : " + person.getTel());
        System.out.println("addr : " + person.getAddress());
    }
}
