package modulo1;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado;

        System.out.println("Descubra o lado do quadrado!");

        System.out.print("Digite o lado: ");
        lado = sc.nextInt();
        int area = lado * lado;

        System.out.printf("O tamanho do lado de um quadrado: %d", area);
    }
}
