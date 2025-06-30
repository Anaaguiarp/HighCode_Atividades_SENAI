public class PessoaJuridica extends Contribuinte {
    private int qtdFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, int qtdFuncionarios){
        super(nome, rendaAnual);
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public PessoaJuridica(){}

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public double calcularImposto(){
        if(this.qtdFuncionarios > 10){
            return getRendaAnual() * 0.14;
        }else{
            return getRendaAnual() * 0.16;
        }
    }

    public String toString(){
        return super.toString();
    }

}