package exerciciosControle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AtmTest {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int money_user = lerSaldo(); // Lendo o saldo armazenado

        boolean continuar = true;

        while (continuar) {

            System.out.println("----------------------------------");
            System.out.println("-                                -");
            System.out.println("-    POOR PEOPLES BANK           -");
            System.out.println("-                                -");
            System.out.println("-  1 - Fazer um Saque            -");
            System.out.println("-  2 - Fazer um Depósito         -");
            System.out.println("-  3 - Verificar Saldo           -");
            System.out.println("-  4 - Sair                      -");
            System.out.println("-                                -");
            System.out.println("----------------------------------");

            System.out.print("Qual será a opção: ");
            int resposta = entrada.nextInt();

            switch (resposta) {
                case 1:
                    System.out.print("Qual será o valor do saque: ");
                    int saque = entrada.nextInt();
                    if (money_user >= saque) {
                        money_user -= saque;
                        System.out.println("Valor de R$" + saque + " Retirado com sucesso!");
                        System.out.print("Deseja fazer outra operação (sim/não)? ");
                        String continuarOp = entrada.next();
                        if (continuarOp.equalsIgnoreCase("não")) {
                            continuar = false;
                        }
                    } else {
                        System.out.println("Você não tem saldo suficiente!");
                        System.out.print("Deseja fazer outra operação (sim/não)? ");
                        String continuarOp = entrada.next();
                        if (continuarOp.equalsIgnoreCase("não")) {
                            continuar = false;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Qual o valor do depósito: ");
                    int deposito = entrada.nextInt();
                    money_user += deposito;
                    System.out.println("Você depositou R$" + deposito + " com sucesso!");
                    System.out.print("Deseja fazer outra operação (sim/não)? ");
                    String continuarOp2 = entrada.next();
                    if (continuarOp2.equalsIgnoreCase("não")) {
                        continuar = false;
                    }
                    break;
                case 3:
                    System.out.println("O seu saldo atual é R$" + money_user);
                    System.out.print("Deseja fazer outra operação (sim/não)? ");
                    String continuarOp3 = entrada.next();
                    if (continuarOp3.equalsIgnoreCase("não")) {
                        continuar = false;
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por usar nosso banco. Até mais!");
                    continuar = false;
                    break;
                default:
                    System.out.println("ERRO: OPÇÃO INCORRETA");
                    System.out.print("Deseja escolher outra opção (sim/não)? ");
                    String continuarOp4 = entrada.next();
                    if (continuarOp4.equalsIgnoreCase("não")) {
                        continuar = false;
                    }
                    break;
            }
        }
        // Após sair do loop o saldo é atualizado
        escreverSaldo(money_user);
        entrada.close();
    }

    // Método para ler o saldo do arquivo
    public static int lerSaldo() {
        try {
            File file = new File("saldo.txt");
            Scanner scanner = new Scanner(file);
            int saldo = scanner.nextInt();
            scanner.close();
            return saldo;
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de saldo.");
            return 0;
        }
    }

    // Método para escrever o saldo no arquivo
    public static void escreverSaldo(int saldo) {
        try {
            FileWriter writer = new FileWriter("saldo.txt");
            writer.write(String.valueOf(saldo));
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever o saldo no arquivo.");
        }
    }
}
