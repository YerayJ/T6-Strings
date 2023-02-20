package ejercicios1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Creación de variable que guarda lo que pasa el usuario por teclado
        String frase;

        // Creación de variable que funciona como contador
        int contador = 0;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Pide variable al usuario
        System.out.println("Deme un frase: ");
        frase = key.nextLine();

        // Recorre al revés la frase
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        } // Fin de bucle

        // Muestra el número de espacios en blanco
        System.out.println("Hay " + contador + " espacios en blanco");

    }
}
