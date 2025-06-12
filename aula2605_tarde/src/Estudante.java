import java.util.Arrays;

public class Estudante {
    public int id;
    public String nome;
    public double[] notas;

    public Estudante(){
        this(0, "Desconhecido", new double[]{0,0,0,0,0,0,0,0});
    }

    public Estudante(int id, String nome, double[] notas){
        this.id = id;
        this.nome = nome;
        this.notas = notas;
    }

    public void verificaFrequencia(double totalAulas, double presencas){
        double frequencia = (presencas/totalAulas)*100;
        System.out.printf("Porcentagem de frequência: %.2f%%", frequencia);
    }

    public void verificaAprovacao(){
        double soma = 0;
        for (double nota : this.notas) soma += nota;

        double media = soma / this.notas.length;

        if(media >= 6.0){
            System.out.println("\nAprovado!");
        }else{
            System.out.println("\nReprovado!");
        }
    }

    public void comparaNotas(Estudante outroAluno){
        double soma1 = 0;
        for(double nota1 : notas) soma1 += nota1;

        double soma2 = 0;
        for(double nota2 : outroAluno.notas) soma2 += nota2;

        double media = soma1 / notas.length;
        double media2 = soma2 / outroAluno.notas.length;

        if(media2 < media){
            System.out.printf("\nO aluno '%s' tirou %.2f pontos a mais que o aluno '%s'\n", this.nome,(media-media2),outroAluno.nome);
        }else if(media < media2){
            System.out.printf("\nO aluno '%s' tirou %.2f pontos a mais que o aluno '%s'\n", outroAluno.nome,(media2-media),this.nome);
        }else{
            System.out.println("\nAmbos tem a mesma média.");
        }
    }

    public void implementarSeries(int serie){
        System.out.println("O aluno "+this.nome+" foi implementado a série: "+serie+"°");
    }
    
    public String toString(){
        return "ID:"+this.id+
                "\nNome: "+this.nome+
                "\nNotas: "+Arrays.toString(this.notas) ;
    } 
}
