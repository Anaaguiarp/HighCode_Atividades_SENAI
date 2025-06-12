import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
    private Map<String, Conta> contas;

    public Banco() {
        contas = new HashMap<>();
    }

    public boolean adicionarConta(Conta conta) {
        if (!contas.containsKey(conta.getNumero())) {
            contas.put(conta.getNumero(), conta);
            return true;
        }
        return false;
    }

    public boolean removerConta(String numero) {
        return contas.remove(numero) != null;
    }

    public boolean depositar(String numeroConta, double valor) {
        Conta conta = contas.get(numeroConta);
        return conta != null && conta.depositar(valor);
    }

    public boolean sacar(String numeroConta, double valor) {
        Conta conta = contas.get(numeroConta);
        return conta != null && conta.sacar(valor);
    }

    public boolean transferir(String origemNum, String destinoNum, double valor) {
        Conta origem = contas.get(origemNum);
        Conta destino = contas.get(destinoNum);

        if (origem != null && destino != null && origem.sacar(valor)) {
            destino.depositar(valor);
            origem.getHistoricoTransacoes().add("Transferido R$ " + valor + " para conta " + destinoNum);
            destino.getHistoricoTransacoes().add("Recebido R$ " + valor + " da conta " + origemNum);
            return true;
        }
        return false;
    }

    public void exibirHistorico(String numeroConta) {
        Conta conta = contas.get(numeroConta);
        if (conta != null) {
            System.out.println("Histórico da conta " + numeroConta + ":");
            for (String transacao : conta.getHistoricoTransacoes()) {
                System.out.println(" - " + transacao);
            }
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void exibirTop3Contas() {
        List<Conta> lista = new ArrayList<>(contas.values());
        lista.sort((c1, c2) -> Double.compare(c2.getSaldo(), c1.getSaldo()));

        System.out.println("Top 3 contas com maiores saldos:");
        for (int i = 0; i < Math.min(3, lista.size()); i++) {
            System.out.println((i+1) + ". " + lista.get(i));
        }
    }
}
