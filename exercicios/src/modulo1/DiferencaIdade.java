package modulo1;

import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2, diferenca;

        System.out.print("Digite o nome da primeira pessoa: ");
        nome1 = sc.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        idade1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome da segunda pessoa: ");
        nome2 = sc.nextLine();

        System.out.print("Digite a idade da segunda pessoa: ");
        idade2 = sc.nextInt();

        if (idade1 > idade2) {
            diferenca = idade1 - idade2;
            System.out.printf("A idade de %s é %d de diferença da idade de %s", nome1, diferenca, nome2);
        } else if (idade1 < idade2) {
            diferenca = idade2 - idade1;
            System.out.printf("A idade de %s é %d de diferença da idade de %s", nome2, diferenca, nome1);
        } else {
            System.out.println("As idades são iguais.");
        }
    }
}
