package ejercicios1;

import java.util.Scanner;

public class Ejercicio10 {
    static char codifica(char conjunto1[], char conjunto2[], char c) {
        char caracter = '0';
        // Comprueba que el carácter pasado está dentro del conjunto 1
        if (String.valueOf(conjunto2).contains(String.valueOf(c))){
            // Recorre la tabla del conjunto 1
            for (int i = 0; i < conjunto2.length; i++) {
                // Comprueba si el carácter es igual al carácter de la tabla
                if (c == conjunto2[i]) {
                    // Guarda el caracter actual
                    caracter = conjunto1[i];
                }
            }
        } else {
            // Si no está en la tabla deja el carácter con el valor inicial
            caracter = c;
        }
        return caracter;
    }

    public static void main(String[] args) {
        // Creación de tablas con los conjuntos
        char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};

        // Variable que contiene una palabra
        String palabra;

        // Variable que contiene nueva palabra
        String palabraNueva = "";

        // Creación de escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Pide palabra al usuario
        System.out.println("Deme una palabra palabra: ");
        palabra = key.next();

        // Pasamos la palabra a minúsculas
        palabra = palabra.toLowerCase();

        // Recorre la palabra letra por letra
        for (int i = 0; i < palabra.length(); i++) {
            // Se le suma la letra a la nueva palabra
            palabraNueva += codifica(conjunto1,conjunto2,palabra.charAt(i));
        } // Fin de bucle

        System.out.println("La palabra codificada es " + palabraNueva);

    }
}
