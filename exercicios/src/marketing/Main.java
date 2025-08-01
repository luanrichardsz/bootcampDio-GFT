package marketing;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        var sc = new Scanner(System.in);

        RedesSociais redes = new RedesSociais();
        WhatsApp zapzap = new WhatsApp();
        SMS sms = new SMS();
        Email email = new Email();

        int opc = -1;

        do{
            System.out.println("\nOpções de enviar mensagem do marketing:");
            System.out.println("\n1 - Redes Socias");
            System.out.println("2 - WhatsApp");
            System.out.println("3 - SMS");
            System.out.println("4 - Email");
            System.out.println("5 - Cancelar");
            System.out.print("Digite o número da opção desejada: ");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Mensagem Enviada por Redes Sociais");
                    System.out.println(redes.submit());
                    break;
                case 2:
                    System.out.println("Mensagem Enviada por WhatsApp");
                    System.out.println(zapzap.submit());
                    break;
                case 3:
                    System.out.println("Mensagem Enviada por SMS");
                    System.out.println(sms.submit());
                    break;
                case 4:
                    System.out.println("Mensagem Enviada por Email");
                    System.out.println(email.submit());
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Invalida! Tente novamente");

            }
        } while (opc != 5);
    }
}
