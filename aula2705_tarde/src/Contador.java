public class Contador {
    public static int contagem = 0;
    public static int proximoId = 1;
    public int id;

    public Contador() throws Exception {
        if(contagem >= 10){
            throw new Exception("Limite de instâncias atingido!");
        }
        contagem++;
        this.id = proximoId++;
        System.out.println("Contador criado com ID: "+this.id);
    }

    public static void zerarContador(){
        contagem = 0;
        proximoId = 1;
    }

    public static void rastreiaTotal(){
        System.out.println("Total de instâncias ativas: " + contagem);
    }

    public String toString(){
        return "Contagem: "+contagem+
                "\nID: "+this.id;
    }
}