public class Carro {
    private String nome_da_empresa;
    private String nome_do_modelo;
    private int ano;
    private double quilometragem;
    private double limiteMaximoValocidade;

    public Carro(String nome_da_empresa, String nome_do_modelo, int ano){
        this.nome_da_empresa = nome_da_empresa;
        this.nome_do_modelo = nome_do_modelo;
        setAno(ano);
        this.quilometragem = 0.0;
        this.limiteMaximoValocidade = 0.0;

    }
    
    public String getNome_da_empresa() {
        return nome_da_empresa;
    }

    public void setNome_da_empresa(String nome_da_empresa) {
        this.nome_da_empresa = nome_da_empresa;
    }

    public String getNome_do_modelo() {
        return nome_do_modelo;
    }

    public void setNome_do_modelo(String nome_do_modelo) {
        this.nome_do_modelo = nome_do_modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano < 1886){
            System.err.println("Informe um ano válido!");
        }else{
            this.ano = ano;
        }
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public double getLimiteMaximoValocidade() {
        return limiteMaximoValocidade;
    }

    public void setLimiteMaximoVelocidade(double limiteMaximoVelocidade){
        if(limiteMaximoVelocidade <= 0){
            System.err.println("Informe um valor válido (maior que 0)!");
        }else{
            this.limiteMaximoValocidade = limiteMaximoVelocidade;
        }
    }

    public double eficienciaCombustivel(double distanciaPercorrida, double litros){
        if(distanciaPercorrida <= 0 || litros < 0){
            System.err.println("Informe valores válidos (maiores que 0)!");
        }else if(litros == 0){
            return 0.0;
        }
        return distanciaPercorrida / litros;
    }

    public void drive(double distanciaPercorrida){
        if(distanciaPercorrida < 0){
            System.err.println("Informe uma quilometragem válida!");
        }else{
            this.quilometragem += distanciaPercorrida;
        }
    }
}