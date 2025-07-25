package modulo2;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual número você quer saber a tabuada? ");
        int n = sc.nextInt();

        for (int i = 1;i <= 10; i++){
            System.out.printf("%d * %d = %d", n, i, i*n);
            System.out.println(" ");
        }
    }
}
