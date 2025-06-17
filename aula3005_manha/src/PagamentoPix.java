public class PagamentoPix implements Pagamento {

    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento via Pix com chave " + chavePix + " realizado no valor de R$ " + valor);
    }
}