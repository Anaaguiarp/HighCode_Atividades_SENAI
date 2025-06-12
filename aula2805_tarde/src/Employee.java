import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;
    private LocalDate dataContratacao;
    private String departamento;

    private static final double SALARIO_MINIMO = 1212.00;
    private static final List<String> DEPARTAMENTOS_VALIDOS = Arrays.asList("RH", "TI", "Financeiro", "Marketing", "Vendas");

    public Employee(int id, String name, double salary, LocalDate dataContratacao) {
        this.employeeId = id;
        this.employeeName = name;
        setEmployeeSalary(salary);
        this.dataContratacao = dataContratacao;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSalary() {
        return String.format("R$ %.2f", employeeSalary);
    }

    public boolean setEmployeeSalary(double novoSalario) {
        if (novoSalario < SALARIO_MINIMO) {
            System.out.println("Salário não pode ser menor que o salário mínimo.");
            return false;
        }
        if (novoSalario < this.employeeSalary) {
            System.out.println("Redução salarial não é permitida.");
            return false;
        }
        this.employeeSalary = novoSalario;
        return true;
    }

    public int calcularAnosDeServico() {
        if (dataContratacao == null) return 0;
        LocalDate hoje = LocalDate.now();
        return Period.between(dataContratacao, hoje).getYears();
    }

    public String getDepartamento() {
        return departamento;
    }

    public boolean setDepartamento(String departamento) {
        if (DEPARTAMENTOS_VALIDOS.contains(departamento)) {
            this.departamento = departamento;
            return true;
        } else {
            System.out.println("Departamento inválido. Use um dos seguintes: " + DEPARTAMENTOS_VALIDOS);
            return false;
        }
    }

    public void exibirInfo() {
        System.out.println("ID: " + employeeId);
        System.out.println("Nome: " + employeeName);
        System.out.println("Salário: " + getEmployeeSalary());
        System.out.println("Departamento: " + (departamento != null ? departamento : "Não atribuído"));
        System.out.println("Anos de Serviço: " + calcularAnosDeServico());
        System.out.println("------------------------");
    }
}