package modulo2;

import java.util.Scanner;

/*
Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a
opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados,
incluindo os números informados e em ordem decrescente;
 */

public class ImparesOuPares {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        var n1 = sc.nextInt();

        System.out.print("Digite um numero maior do que você digitou: ");
        var n2 = sc.nextInt();
        sc.nextLine();

        if (n1 > n2){
            System.out.println("O segundo DEVE ser maior que o primeiro!");
            return;
        }

        System.out.println("Você quer ver numeros pares ou impares? (par/impar): ");
        var opcao = sc.nextLine().toLowerCase();

        System.out.printf("Números %s no intervalo de %d até %d: ", opcao, n1, n2);

        for(var i = n2; i >= n1; i--){
            if(opcao.equals("par") && i % 2 == 0){
                System.out.println(i);
            } else if(opcao.equals("impar") && i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
