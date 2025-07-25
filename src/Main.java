import java.util.Scanner;

public class Main {

    private final static String WELCOME_MESSAGE = "\nHello My Friend!";

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);

        System.out.print("Digite seu nome: ");
        var nome = sc.next();

        System.out.print("\nDigite sua idade: ");
        var idade = sc.nextInt();

        System.out.print("\nVocê é emancipado? ");
        var isEmancipado = sc.nextBoolean();

        var canDrive = idade >= 18 || (isEmancipado && idade >= 16);

        var message = (canDrive ?
                nome + ", você pode dirigir \n":
                nome + ", você não pode dirigir \n");

        System.out.printf("\nYour name is %s \n", nome);
        System.out.printf("Your age is %d \n", idade);
        System.out.println(message);
    }
}

