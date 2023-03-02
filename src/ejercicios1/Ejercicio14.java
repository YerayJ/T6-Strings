package ejercicios1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
    // La frase a adivinar por el jugador 2
    static String fraseAdivinar;

    static String transponerCaracteres(String fraseAdivinar) {
        // Guardará de manera desordenada la palabra por carácteres
        char[] arrayDesordenado = new char[fraseAdivinar.length()];
        // Variable auxiliar que comprueba si no se repite
        int intentos = 0;
        // Le da un valor al array
        Arrays.fill(arrayDesordenado, '-');
        // Posiciones para saber donde guardar el valor
        int pos;

        // Genera un número aleatorio
        pos = (int) (Math.random() * fraseAdivinar.length());

        // Mientras el número de intentos sea menor que la longitud sigue ejecutandose
        while (intentos < fraseAdivinar.length()) {
            // Comprueba si la posición del array aleatorio es igual a un guión
            if (arrayDesordenado[pos] == '-') {
                // Añade la letra de la frase a una posición aleatoria en el array
                arrayDesordenado[pos] = fraseAdivinar.charAt(intentos);
                // Se le suma a los intentos
                intentos++;
            }
            // Genera un número aleatorio
            pos = (int) (Math.random() * fraseAdivinar.length());
        }

        // Devuelve como una cadena desordenada
        return String.valueOf(arrayDesordenado);
    }

    public static void main(String[] args) {
        // Variable que contiene la respuesta del usuario
        String respuesta;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Pide frase al usuario
        do {
            System.out.println("Introduce una frase: ");
            fraseAdivinar = key.nextLine();

        } while (fraseAdivinar.equals(""));

        // Muestra la pista al usuario
        System.out.println("La pista es: " + transponerCaracteres(fraseAdivinar));

        do {
            // Pide la respuesta al usuario
            System.out.println("Adivine la frase: ");
            respuesta = key.nextLine();
        // Comprueba si el usuario ha acertado la frase
        } while (!respuesta.equals(fraseAdivinar));

        // Le dice que ha ganado
        System.out.println("HAS ACERTADO");
    }
}
