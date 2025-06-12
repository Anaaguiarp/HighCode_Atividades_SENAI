public class Circle {
    private double radius;
    public static final double PI = 3.1415926;

    public Circle(double radius) {
        if(radius < 0 || radius == 0){
            System.err.println("O raio não pode ser zero ou negativo!");
        }else{
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculaArea(){
        return PI * Math.pow(radius, 2);
    }

    public double calculaPerimeter(){ //também calcula circunferência
        return 2 * PI * radius;
    }

    public void comparaTamanho(Circle outroCirculo){
        if(calculaArea() == outroCirculo.calculaArea()){
            System.out.println("Os círculos tem o mesmo tamanho!");
        }else if(calculaArea() < outroCirculo.calculaArea()){
            System.out.println("O círculo 1 cabe dentro círculo 2");
        }else{
            System.out.println("O círculo 2 cade dentro círculo 1!");
        }
    }

    public void redimensionaRaio(double fatorEscala){
        if(fatorEscala < 0 || fatorEscala == 0){
            System.err.println("O fator de escala não pode ser zero ou negativo!");
        }else{
            setRadius(this.radius * fatorEscala);
        }
    }
}