package Ejercicio_4;

public class Potencia {

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int resultado = potencia(x, y);
        System.out.println(x + " elevado a la " + y + " es igual a: " + resultado);
    }

    public static int potencia(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
