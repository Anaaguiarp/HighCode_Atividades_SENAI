public class Exibidor {

    public void exibir(String texto) {
        System.out.println("Texto: " + texto);
    }

    public void exibir(int numero) {
        System.out.println("Número inteiro: " + numero);
    }

    public void exibir(double numero) {
        System.out.println("Número decimal: " + numero);
    }

    public void exibir(Object obj) {
        System.out.println("Objeto: " + obj.toString());
    }
}