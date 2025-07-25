package modulo1;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int base, altura, area;

        System.out.print("Digite a base do retângulo: ");
        base = sc.nextInt();

        System.out.print("Digite a base do altura: ");
        altura = sc.nextInt();

        area = base * altura;

        System.out.printf("\nO tamanho do retângulo: %d", area);
    }
}
