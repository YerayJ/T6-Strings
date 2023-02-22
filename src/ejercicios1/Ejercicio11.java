package ejercicios1;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Variable que guarda la frase
        String frase;

        // Variable que guarda la palabra con mayor longitud
        String mayor = "";

        // Creación de escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Pide la frase al usuario
        System.out.println("Deme una frase: ");
        frase = key.nextLine();

        // Array para guardar las palabras
        String palabras[] = frase.split(" ");

        // Recorre el array
        for (int i = 0; i < palabras.length; i++) {
            // Comprueba si la palabra es mayor y la guarda en la variable mayor
            if (palabras[i].length() > mayor.length()) {
                mayor = palabras[i];
            }
        } // Fin de bucle

        // Muestra resultado
        System.out.println("La palabra mayor es: " + mayor + " y su número de carácteres es " + mayor.length());

        // Cierre de escáner
        key.close();
    }
}
