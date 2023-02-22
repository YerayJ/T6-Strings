package ejercicios1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Variable que guarda la frase
        String palabra1,palabra2;

        // Array que contiene las letras
        char letras1[];
        char letras2[];

        // Creación de escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Pide palabra al usuario
        System.out.println("Deme dos palabras: ");
        palabra1 = key.next();
        palabra2 = key.next();

        // Convierte la palabra 1 en carácteres
        letras1 = palabra1.toCharArray();
        letras2 = palabra2.toCharArray();

        // Ordena los arrays
        Arrays.sort(letras1);
        Arrays.sort(letras2);

        // Compara los arrays
        if (Arrays.equals(letras1,letras2)  ) {
            System.out.println("Son anagramas");
        } else {
            System.out.println("No son anagramas");
        }

        // Cierre de escáner
        key.close();

    }
}
