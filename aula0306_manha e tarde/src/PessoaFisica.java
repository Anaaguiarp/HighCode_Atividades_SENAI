public class PessoaFisica extends Contribuinte {
    private double saudeGasto;

    public PessoaFisica(String nome, double rendaAnual, double saudeGasto){
        super(nome, rendaAnual);
        this.saudeGasto = saudeGasto;
    }

    public PessoaFisica(){}

    public double getSaldoGasto() {
        return saudeGasto;
    }

    public void setSaudeGasto(double saudeGasto) {
        this.saudeGasto = saudeGasto;
    }

    public double calcularImposto() {
        double impostoBruto;
        double rendaAnual = getRendaAnual();
        double gastosComSaude = getSaldoGasto();
        
        if (rendaAnual < 20000.00) {
            impostoBruto = rendaAnual * 0.15;
        } else {
            impostoBruto = rendaAnual * 0.25;
        }
    
        double abatimentoSaude = gastosComSaude * 0.50;
    
        double impostoFinal = impostoBruto - abatimentoSaude;
    
        if (impostoFinal < 0) {
            return 0;
        } else {
            return impostoFinal;
        }
    }

    public String toString(){
        return super.toString();
    }

}