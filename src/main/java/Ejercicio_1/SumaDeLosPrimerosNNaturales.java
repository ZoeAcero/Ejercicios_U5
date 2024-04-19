package Ejercicio_1;

public class SumaDeLosPrimerosNNaturales {

    public static void main(String[] args) {
        int n = 5; // Ejemplo: calcular la suma de los primeros 5 números naturales
        int suma = sumaNaturales(n);
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
    }

    public static int sumaNaturales(int n) {
        return n * (n + 1) / 2;
    }
}

