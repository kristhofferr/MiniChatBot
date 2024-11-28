import java.util.Scanner;

public class Mainn {

    public static void main(String[] args) {
        CarteiraDigital carteira = new CarteiraDigital();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            menu();  // Exibe o menu de opções
            opcao = lerEntradaUsuario(scanner);  // Lê a escolha do usuário

            // Processa a escolha do usuário
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para adicionar ao saldo: R$");
                    double valorAdicionar = scanner.nextDouble();
                    carteira.adicionarSaldo(valorAdicionar);
                    break;

                case 2:
                    System.out.print("Digite o valor do pagamento: R$");
                    double valorPagamento = scanner.nextDouble();
                    carteira.realizarPagamento(valorPagamento);
                    break;

                case 3:
                    carteira.verificarSaldo();
                    break;

                case 4:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            scanner.nextLine();  // Limpa o buffer do scanner após a leitura de um número

        } while (opcao != 4);  // O loop continua até o usuário escolher sair

        scanner.close();
    }

    // Exibe o menu de opções
    public static void menu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Adicionar Saldo");
        System.out.println("2. Realizar Pagamento");
        System.out.println("3. Verificar Saldo");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    // Lê a opção escolhida pelo usuário
    public static int lerEntradaUsuario(Scanner scanner) {
        return scanner.nextInt();
    }
}



