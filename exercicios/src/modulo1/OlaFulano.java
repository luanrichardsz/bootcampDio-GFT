package modulo1;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class OlaFulano {

    private final static String WELCOME_MESSAGE = "\nHello My Friend!";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(WELCOME_MESSAGE);

        var anoBase = OffsetDateTime.now().getYear();

        System.out.print("\nDigite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        int anoDeNascimento = sc.nextInt();

        if (anoDeNascimento >= anoBase){
            System.out.println("ano de nascimento incorreto, seu covarde");
        } else {
            int idade = anoBase - anoDeNascimento;
            System.out.printf("\nOlá %s! Você tem %d anos.", nome, idade);
        }
    }
}