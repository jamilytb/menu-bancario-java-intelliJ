import java.util.Scanner;

public class MovimentaçõesFinanceiras {
    public static void main(String[] args) {
        String nome = "Isabela Menezes da Silva";
        String tipoDeConta = "Corrente";
        double saldo = 5500;
        int opcao = 0;

        System.out.println("*****************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoDeConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n*****************************");

        String menu = """
                Digite a sua opção:
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que você deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo para realizar transferências");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
    }
  }
}