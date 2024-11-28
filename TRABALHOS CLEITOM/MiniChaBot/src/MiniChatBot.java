import java.util.Scanner;

public class MiniChatBot {

    // Função para interação com o usuário
    public void interagirComUsuario() {
        // Criação do Scanner para capturar as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Eu sou o MiniChatbot. Como posso ajudar você?");

        // Loop para continuar a conversa até o usuário digitar "sair"
        while (true) {
            // Recebe a entrada do usuário
            String input = scanner.nextLine().toLowerCase().trim();  // .trim() remove espaços extras e .toLowerCase() normaliza a entrada

            // Se o usuário digitar "sair", termina a conversa
            if (input.equals("sair")) {
                System.out.println("Até logo! Foi um prazer conversar com você.");
                break;
            }

            // Chama a função da classe Main para processar a entrada e retornar a resposta
            String resposta = Main.processarEntrada(input);
            System.out.println(resposta);
        }

        // Fecha o scanner
        scanner.close();
    }
}
