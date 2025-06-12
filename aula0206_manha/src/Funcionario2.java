import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Funcionario2 {
    private String nome;
    private double salario;
    private String dataContratacao; // formato esperado: "yyyy-MM-dd"

    private List<CargoAnterior> cargosAnteriores = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getDataContratacao() {
        return dataContratacao;
    }
    
    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public int calcularAnosServico() {
        LocalDate dataContrat = LocalDate.parse(dataContratacao);
        LocalDate hoje = LocalDate.now();
        return Period.between(dataContrat, hoje).getYears();
    }

    public int mesesParaProximaPromocao() {
        LocalDate dataContrat = LocalDate.parse(dataContratacao);
        LocalDate hoje = LocalDate.now();
        int anosServico = calcularAnosServico();
        int proximaPromo = ((anosServico / 3) + 1) * 3;
        LocalDate dataProximaPromo = dataContrat.plusYears(proximaPromo);
        Period periodo = Period.between(hoje, dataProximaPromo);
        return periodo.getYears() * 12 + periodo.getMonths();
    }

    public double calcularBonus() {
        int anos = calcularAnosServico();
        double bonusPercent = anos * 5;
        return salario * bonusPercent / 100;
    }

    public void adicionarCargoAnterior(String cargo, int anosOcupados) {
        cargosAnteriores.add(new CargoAnterior(cargo, anosOcupados));
    }

    public List<CargoAnterior> getCargosAnteriores() {
        return cargosAnteriores;
    }

    public int anosParaAposentadoria(int idadeAtual, int idadeAposentadoria) {
        return idadeAposentadoria - idadeAtual;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nSalário: R$ " + String.format("%.2f", salario) +
                "\nData Contratação: " + dataContratacao +
                "\nAnos de Serviço: " + calcularAnosServico() +
                "\nMeses para próxima promoção: " + mesesParaProximaPromocao() +
                "\nBônus: R$ " + String.format("%.2f", calcularBonus()) +
                "\nCargos Anteriores: " + cargosAnteriores;
    }

    public static class CargoAnterior {
        private String cargo;
        private int anos;

        public CargoAnterior(String cargo, int anos) {
            this.cargo = cargo;
            this.anos = anos;
        }

        @Override
        public String toString() {
            return cargo + " (" + anos + " anos)";
        }
    }
}