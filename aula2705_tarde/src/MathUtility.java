public class MathUtility {
    public static int add(int n1, int n2){
        return n1 + n2;
    }

    public static double multiply(int n1, int n2){
        return n1 * n2;
    }

    public static int maxOfThree(int n1, int n2, int n3){
        return Math.max(n1, Math.max(n2, n3));
    }

    public static double factorial(int n){
        double fatorial = 1;
        for(int i = 2; i <= n; i++){
            fatorial *= i;
        }
        return fatorial;
    }

    public static double exponentiation(int base, int expoente){
        return Math.pow(base, expoente);
    }
}