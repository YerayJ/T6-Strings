package ejercicios1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Creación de variable que guarda lo que pasa el usuario por teclado
        String frase;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Pide variable al usuario
        System.out.println("Deme un frase: ");
        frase = key.nextLine();

        // Recorre al revés la frase
        for (int i = frase.length(); i > 0; i--) {
            // Coge la letra que está en la posición y la imprime
            System.out.print(frase.charAt(i-1));
        } // Fin de bucle

        // Cierre de escáner
        key.close();
    }
}
