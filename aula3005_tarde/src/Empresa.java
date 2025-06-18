import java.util.*;

abstract class Funcionarios {
    private String nome;
    private String endereco;
    private double salario;
    private String cargo;

    public Funcionarios(String nome, String endereco, double salario, String cargo) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public double getSalario() { return salario; }
    public String getCargo() { return cargo; }

    public void setNome(String nome) { this.nome = nome; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setSalario(double salario) { this.salario = salario; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public abstract void gerarRelatorioDesempenho();

    public void iniciarMentoria(String novoFuncionario) {
        System.out.println(nome + " está mentorando o novo contratado: " + novoFuncionario);
    }
}

class Manager extends Funcionarios {
    public Manager(String nome, String endereco, double salario, String cargo) {
        super(nome, endereco, salario, cargo);
    }

    public double calcularBonus(int classificacaoDesempenho) {
        double bonus = 0;
        if (classificacaoDesempenho >= 9) {
            bonus = getSalario() * 0.20;
        } else if (classificacaoDesempenho >= 7) {
            bonus = getSalario() * 0.10;
        } else {
            bonus = getSalario() * 0.05;
        }
        System.out.println("Bônus para " + getNome() + ": R$" + bonus);
        return bonus;
    }

    @Override
    public void gerarRelatorioDesempenho() {
        System.out.println("Gerando relatório de desempenho para gerente: " + getNome());
    }
}

class Developer extends Funcionarios {
    private List<String> projetosConcluidos = new ArrayList<>();
    private List<String> prazosPendentes = new ArrayList<>();

    public Developer(String nome, String endereco, double salario, String cargo) {
        super(nome, endereco, salario, cargo);
    }

    public void adicionarProjetoConcluido(String projeto) {
        projetosConcluidos.add(projeto);
        System.out.println("Projeto concluído: " + projeto);
    }

    public void adicionarPrazoPendente(String projeto) {
        prazosPendentes.add(projeto);
        System.out.println("Prazo pendente: " + projeto);
    }

    @Override
    public void gerarRelatorioDesempenho() {
        System.out.println("Desempenho de " + getNome());
        System.out.println("Projetos concluídos: " + projetosConcluidos);
        System.out.println("Prazos pendentes: " + prazosPendentes);
    }
}

class Programmer extends Funcionarios {
    private Map<String, Integer> horasPorDia = new HashMap<>();

    public Programmer(String nome, String endereco, double salario, String cargo) {
        super(nome, endereco, salario, cargo);
    }

    public void registrarHoras(String data, int horas) {
        horasPorDia.put(data, horas);
        System.out.println("Registrado: " + horas + "h em " + data);
    }

    @Override
    public void gerarRelatorioDesempenho() {
        System.out.println("Relatório de horas codificadas por " + getNome() + ": " + horasPorDia);
    }
}

public class Empresa {
    public static void main(String[] args) {
        Manager gerente = new Manager("Carlos", "Rua A", 8000, "Gerente");
        gerente.calcularBonus(8);
        gerente.gerarRelatorioDesempenho();
        gerente.iniciarMentoria("João");

        Developer dev = new Developer("Ana", "Rua B", 6000, "Desenvolvedora");
        dev.adicionarProjetoConcluido("Sistema de Vendas");
        dev.adicionarPrazoPendente("App Móvel");
        dev.gerarRelatorioDesempenho();

        Programmer prog = new Programmer("Lucas", "Rua C", 5000, "Programador");
        prog.registrarHoras("2025-06-17", 6);
        prog.registrarHoras("2025-06-18", 7);
        prog.gerarRelatorioDesempenho();
    }
}
