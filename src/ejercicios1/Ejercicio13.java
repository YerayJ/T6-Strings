package ejercicios1;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        // Variable que guarda la frase
        String frase;

        // Guarda abecedario en un array
        char abecedario[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u'
        ,'w','x','y','z'};

        // Creación de variable contador
        int contador;

        // Creación de escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Pide la frase al usuario
        System.out.println("Deme una frase: ");
        frase = key.nextLine();

        // Convierte la frase en minúsculas
        frase = frase.toLowerCase();

        // Imprime resultado
        System.out.println("Resultado");

        // Recorre el abecedario
        for (int i = 0; i < abecedario.length; i++) {
            // Inicializa el contador a 0
            contador = 0;
            // Recorre la frase
            for (int j = 0; j < frase.length(); j++) {
                // Comprueba si la letra es igual a la del abecedario
                if (abecedario[i] == frase.charAt(j)) {
                    // Si encuentra la letra suma al contador
                    contador++;
                }
            }
            // Si encuentra mínimo una vez la letra la muestra
            if (contador > 0) {
                // Imprime el resultado
                System.out.println(abecedario[i] + ": " + contador + (contador == 1 ? " vez" :" veces"));
            }
        } // Fin de bucle

    }
}
