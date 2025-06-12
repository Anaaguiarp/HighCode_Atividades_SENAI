import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Curso> cursos = new ArrayList<>();

    private int frequenciaTotal;
    private int frequenciaPresenca;

    private LocalDate dataInicioCurso;
    private int duracaoCursoMeses;

    public Aluno(String nome, LocalDate dataInicioCurso, int duracaoCursoMeses) {
        this.nome = nome;
        this.dataInicioCurso = dataInicioCurso;
        this.duracaoCursoMeses = duracaoCursoMeses;
    }

    public void adicionarCurso(String nomeCurso, double nota) {
        cursos.add(new Curso(nomeCurso, nota));
    }

    public boolean removerCurso(String nomeCurso) {
        return cursos.removeIf(c -> c.getNome().equalsIgnoreCase(nomeCurso));
    }

    public double calcularNotaMedia() {
        if (cursos.isEmpty()) return 0;
        double soma = 0;
        for (Curso c : cursos) {
            soma += c.getNota();
        }
        return soma / cursos.size();
    }

    public void registrarFrequencia(int totalAulas, int aulasAssistidas) {
        this.frequenciaTotal = totalAulas;
        this.frequenciaPresenca = aulasAssistidas;
    }

    public boolean frequenciaBaixa() {
        if (frequenciaTotal == 0) return false;
        double percent = (double) frequenciaPresenca / frequenciaTotal * 100;
        return percent < 75;
    }

    public boolean elegivelBolsa() {
        if (frequenciaTotal == 0) return false;
        double freqPercent = (double) frequenciaPresenca / frequenciaTotal * 100;
        return calcularNotaMedia() >= 7 && freqPercent >= 80;
    }

    public LocalDate preverFormatura() {
        return dataInicioCurso.plusMonths(duracaoCursoMeses);
    }

    @Override
    public String toString() {
        return "Aluno: " + nome +
                "\nNota Média: " + String.format("%.2f", calcularNotaMedia()) +
                "\nFrequência: " + frequenciaPresenca + "/" + frequenciaTotal +
                (frequenciaBaixa() ? " (Frequência baixa!)" : "") +
                "\nElegível para bolsa: " + (elegivelBolsa() ? "Sim" : "Não") +
                "\nPrevisão de formatura: " + preverFormatura() +
                "\nCursos matriculados: " + cursos;
    }
}