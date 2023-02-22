package ejercicios1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Variable que guarda la frase
        String frase;

        // Variable auxiliar para guardar la frase inversa
        String fraseInvertida = "";

        // Creación de escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Pide la frase al usuario
        System.out.println("Deme una frase y le diré si es palíndroma: ");
        frase = key.nextLine();

        // Eliminar los espacios en blanco
        frase = frase.replace(" ", "");

        // Bucle que recorre la frase letra por letra
        for (int i = frase.length() - 1; i >= 0; i--) {
            // Guarda los carácteres ignorando los espacios en blanco
            if (frase.charAt(i) != ' ') {
                fraseInvertida += frase.charAt(i);
            }
        } // Fin de bucle

        // Comprueba si son iguales las cadenas
        if (fraseInvertida.equalsIgnoreCase(frase)) {
            System.out.println("La frase es políndroma");
        } else {
            System.out.println("No es políndroma");
        }

        // Cierre de escáner
        key.close();
    }
}
