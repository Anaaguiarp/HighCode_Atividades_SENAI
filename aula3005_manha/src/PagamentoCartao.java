public class PagamentoCartao implements Pagamento {

    private String numeroCartao;

    public PagamentoCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento no cartão " + numeroCartao + " realizado no valor de R$ " + valor);
    }
}