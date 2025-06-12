import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--------------------Exercício 1--------------------");
        Student student = new Student();
        //System.out.println("Informe um nome: ");
        //student.setStudent_name("");
        //student.setStudent_name(sc.next());
        student.addGrade(0, 10);

        sc.close();
    }
}