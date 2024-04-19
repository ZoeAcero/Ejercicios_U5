package Ejercicio_2;

public class NumerosNaturales {

    public static void main(String[] args) {
        int a = 3;
        int d = 8;
        imprimirNaturalesEntre(a, d);
    }

    public static void imprimirNaturalesEntre(int a, int d) {
        for (int i = a; i <= d; i++) {
            System.out.println(i);
        }
    }
}

