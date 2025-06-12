import java.util.ArrayList;

public class Student {
    private int student_id = 0;
    private String student_name;
    private ArrayList<Double> grades = new ArrayList<>();

    public Student(/*String student_name*/){
        this.student_id = student_id++;
        /*if(student_name == null || student_name.isEmpty()){
            throw new IllegalArgumentException("O campo nome não pode ficar vazio!");
        }
        this.student_name = student_name;*/
    }

    public Student(int student_id, String student_name) {
        this.student_id = student_id++;
        if(student_name == null || student_name.isEmpty()){
            throw new IllegalArgumentException("O campo nome não pode ficar vazio!");
        }
        this.student_name = student_name;
    }
    public int getStudent_id() {
        return this.student_id;
    }
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
    public String getStudent_name() {
        return this.student_name;
    }
    public void setStudent_name(String student_name) {
        if(student_name == null || student_name.isEmpty()){
            throw new IllegalArgumentException("O campo nome não pode ficar vazio!");
        }
        this.student_name = student_name;
    }
    /*
    public ArrayList<String> getGrades() {
        return this.grades;
    }
    public void setGrades(ArrayList<String> grades) {
        this.grades = grades;
    }*/

    public void addGrade(double nota, double notaMaxima){
        if(nota >= 0 && nota <= 100){
            if(nota <= (notaMaxima/2)){
                System.out.println("Infelizmente a nota não foi satisfatória");
            }else{
                System.out.println("Parabéns! Nota satisfatória!");
            }
        }else{
            throw new IllegalArgumentException("A nota deve estar entre um intervalo de 0 a 100!");
        }
        this.grades.add(nota);
    }

    public void calculaMedia(double nota){
        double soma = 0;
        soma+=nota;
        System.out.println("Média: "+soma/this.grades.size());
    }

    public String toString(){
        return "ID: "+this.student_id+
                "\nNome: "+this.student_name+
                "\nGrade: "+this.grades;
    }
}
