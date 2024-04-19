package Ejercicio_3;

public class CantidadDigitos {

    public static void main(String[] args) {
        int numero = 12345; // Ejemplo: contar los dígitos de 12345
        int cantidadDigitos = contarDigitos(numero);
        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");
    }

    public static int contarDigitos(int numero) {
        return (int) Math.log10(Math.abs(numero)) + 1;
    }
}
