import java.util.ArrayList;
import java.util.List;

public class CarteiraDigital {

    private double saldo;
    private List<String> historicoTransacoes;

    // Construtor
    public CarteiraDigital() {
        this.saldo = 0.0;
        this.historicoTransacoes = new ArrayList<>();
    }

    // Método para adicionar saldo
    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
            historicoTransacoes.add("Adição de R$" + valor);
            System.out.println("Saldo adicionado com sucesso! Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor inválido para adição.");
        }
    }

    // Método para realizar pagamento
    public void realizarPagamento(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            historicoTransacoes.add("Pagamento de R$" + valor);
            System.out.println("Pagamento de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o pagamento.");
        }
    }

    // Método para verificar saldo
    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    // Método opcional para mostrar histórico de transações
    public void historicoTransacoes() {
        if (historicoTransacoes.isEmpty()) {
            System.out.println("Nenhuma transação realizada ainda.");
        } else {
            System.out.println("Histórico de Transações:");
            for (String transacao : historicoTransacoes) {
                System.out.println(transacao);
            }
        }
    }
}