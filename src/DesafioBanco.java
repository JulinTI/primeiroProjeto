import java.util.Scanner;

public class DesafioBanco {

    public static void main(String[] args) {

        String nome = "Julio Cesar Abreu dos Santos";
        String tipoConta = "Conta corrente";
        double saldo = 2500;
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        System.out.println("************************************************************");
        System.out.println("Dados iniciais do cliente ");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n*************************************************************");


        while (opcao != 4){
            System.out.println("Operações: ");
            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            opcao = leitura.nextInt();
            if(opcao == 1){
                System.out.println("Saldo em conta " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor recebido: ");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
            } else if (opcao == 3) {
                System.out.println("Digite o valor que deseja transferir: ");
                double valorTransferido = leitura.nextDouble();
                if (valorTransferido > saldo){
                    System.out.println("Saldo insuficiente para transferencia ");
                } else {
                    saldo -= valorTransferido;
                }

            }


        }

    }

}
