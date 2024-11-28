public class Main {

    // Função para responder a saudações
    public static String responderSaudacao(String input) {
        if (input.contains("olá") || input.contains("oi") || input.contains("e aí")) {
            return "Olá! Como posso ajudar você hoje?";
        }
        return "";
    }

    // Função para responder a perguntas sobre o nome do chatbot
    public static String responderNome(String input) {
        if (input.contains("qual é o seu nome") || input.contains("quem é você") || input.contains("qual seu nome")) {
            return "Meu nome é MiniChatbot!";
        }
        return "";
    }

    // Função para responder a perguntas sobre o estado do chatbot
    public static String responderEstado(String input) {
        if (input.contains("como você está") || input.contains("tudo bem") || input.contains("como vai")) {
            return "Estou funcionando perfeitamente, obrigado!";
        }
        return "";
    }

    // Função para responder a perguntas não reconhecidas
    public static String responderDesconhecido() {
        return "Desculpe, não entendi sua pergunta. Pode reformular?";
    }

    // Função para processar a entrada e retornar a resposta adequada
    public static String processarEntrada(String input) {
        // Verificar cada tipo de pergunta, se alguma corresponder, retorna a resposta
        String resposta = responderSaudacao(input);
        if (!resposta.isEmpty()) {
            return resposta;
        }

        resposta = responderNome(input);
        if (!resposta.isEmpty()) {
            return resposta;
        }

        resposta = responderEstado(input);
        if (!resposta.isEmpty()) {
            return resposta;
        }

        return responderDesconhecido();
    }

    public static void main(String[] args) {
        // Criação do objeto MiniChatbot
        MiniChatBot chatbot = new MiniChatBot();

        // Chama a função de interação com o usuário
        chatbot.interagirComUsuario();
    }
}
