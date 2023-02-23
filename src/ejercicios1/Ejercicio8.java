package ejercicios1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Variable que guarda la frase
        String frase;

        // Variable que guarda la frase traducida
        String fraseTraducida = "";

        // Variable auxiliar para guardar la frase inversa
        final String PREFIJO = "Javalín, javalón";
        final String SUFIJO = "javalén, len, len";

        // Creación de escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Pide la frase al usuario
        System.out.println("Deme una frase y le diré si es está en idioma Javalandia: ");
        frase = key.nextLine();

        // Comprueba si el prefijo está en idioma Javalandia
        if (frase.startsWith(PREFIJO)) {
            // Coge la subcadena sin el prefijo
            fraseTraducida = frase.substring(PREFIJO.length());
            // Muestra la frase traducida
            System.out.println("Frase traducida:" + fraseTraducida);
            // Comprueba que la frase termine en el sufijo
        } else if (frase.endsWith(SUFIJO)) {
            // Coge la subcadena sin el prefijo
            fraseTraducida = frase.substring(0,frase.length()-SUFIJO.length());
            // Muestra la frase traducida
            System.out.println("Frase traducida: " + fraseTraducida);
            // En caso de que no contenga ni el prefijo ni el sufijo, muestra que no está en ese idioma
        } else {
            System.out.println("No está en idioma Javalandia");
        }

        // Cierre de escáner
        key.close();
    }
}
