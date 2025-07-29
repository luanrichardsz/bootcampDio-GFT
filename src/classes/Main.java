package classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        var male = new Person();
        var female = new Person();

        male.setName("Luan");
        male.setAge(81);

        female.setName("Rebeka");
        female.setAge(99);

        System.out.println("Male Name: " + male.getName() + " \nage: " + male.getAge());
        System.out.println("Female Name: " + female.getName() +  " \nage: " + female.getAge());

        male.setName("Roberto");
        System.out.println("Male Name: " + male.getName());
    }
}
