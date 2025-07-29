package bancoMoney;

import java.util.Scanner;
import java.util.Random;

public class Bank {
    public static void bank(){
        var sc = new Scanner(System.in);
        var random = new Random();

        String confirmar;
        int opc, codigoDeBarrasBoleto;
        double saldo, deposito, chequeEspecial, saque, valorBoleto = 0;

        System.out.print("\nDigite Seu Nome: ");
        var nome = sc.nextLine();

        System.out.println("\nSr(a) " + nome + ". Deposite uma quantia para a criação da conta.");
        System.out.print("Digite o valor que deseja depositar: ");
        saldo = sc.nextDouble();

        if (saldo >= 500){
            chequeEspecial = saldo / 2;
        } else {
            chequeEspecial = 50;
        }

        do{
            System.out.println(
                            "\nOlá " + nome + "!" +
                            "\n\nConsultar Saldo - Digite 1" +
                            "\nConsultar Cheque Especial - Digite 2" +
                            "\nDepositar Dinheiro - Digite 3" +
                            "\nSacar Dinheiro - Digite 4" +
                            "\nPagar um Boleto - Digite 5" +
                            "\nVerificar se a Conta Esta Usando o Cheque Especial - Digite 6" +
                            "\nSair - Digite 0");

            System.out.print("\nDigite a opção da ação que deseja: ");

            opc = sc.nextInt();
            
            switch (opc){
                case 1:
                    System.out.println("Seu saldo disponivel: R$" + saldo);
                    break;
                case 2:
                    System.out.println("Seu cheque especial disponivel: R$" + chequeEspecial);
                    break;
                case 3:
                    System.out.print("Digite a quantia para deposito: R$");
                    deposito = sc.nextDouble();

                    saldo += deposito;
                    System.out.println("Seu saldo disponivel: R$" + saldo);
                    break;
                case 4:
                    System.out.print("Digite a quantia para o saque: R$");
                    saque = sc.nextDouble();

                    if (saque > saldo){
                        System.out.println("Saque maior que seu saldo");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque Realizado com Sucesso" +
                                           "\nSeu saldo disponivel: R$" + saldo);
                    }
                    break;
                case 5:
                    System.out.print("Digite o codigo de barras do boleto: ");
                    codigoDeBarrasBoleto = sc.nextInt();
                    sc.nextLine();

                    valorBoleto = random.nextDouble((double)saldo); //logica para um numero aleatorio menor que saldo
                    valorBoleto = Math.round(valorBoleto * 100.0) / 100.0; //logica para arrendondar as casas decimais

                    saldo -= valorBoleto;

                    saldo = (saldo * 100.0) / 100.0;

                    System.out.print("Você confirma o pagamento do boleto " + codigoDeBarrasBoleto + " no valor de R$" + valorBoleto + "? (sim/nao): ");
                    confirmar = sc.nextLine().toLowerCase();

                    if (confirmar.equals("sim")){
                        System.out.println("Boleto " + codigoDeBarrasBoleto + ", de R$" + valorBoleto + " pago com sucesso!" +
                                           "\nSeu saldo disponivel: R$" + saldo);
                    } else if (confirmar.equals("nao")){
                        System.out.println("PAGAMENTO NEGADO!");
                    } else {
                        System.out.println("Confirmação Invalida. Tente Novamente");
                    }
                    break;

                case 6:
                    if (chequeEspecial >= 0){
                        System.out.println("Você não esta no cheque especial!");
                    } else {
                        System.out.println("Você esta no cheque especial");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do Money Bank.....");
                    break;
                default:
                    System.out.println("Opção Invalida! Tente Novamente.");

            }
        } while (opc != 0);
    }
}
