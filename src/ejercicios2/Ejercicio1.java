package ejercicios2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Creación de variable que contiene la sentencia del usuario
        String sentencia;
        // Creación de variable donde se irá introduciendo la frase sin los comentarios
        String sentenciaFinal = "";
        // Creación de escáner
        Scanner key = new Scanner(System.in);
        // Creación de variables que guardarán las posiciones de donde este los comentarios
        int posAnterior = 0;
        int posInicial = 0;

        // Pide la sentencia al usuario
        System.out.println("Deme una sentencia en C: ");
        sentencia = key.nextLine();


        // Recorre la frase
        do {
            // Le da un valor inicial a la posición que empieza a partir de que se abra el primer comentario
            int aux = sentencia.indexOf("/*", posInicial);
            // Recorre la frase hasta el siguiente comentario
            for (int pos = posAnterior; pos < aux; pos++) {
                sentenciaFinal += sentencia.charAt(pos);
            }
            // Guarda el último resultado en la próxima posición inicial y le añade 3, ya que debe pasar por delante del
            // comentario
            posAnterior = sentencia.indexOf("*/",posInicial) + 3;

            posInicial = posAnterior;

        } while (posInicial < sentencia.length());
        
        // Muestra resultado
        System.out.println(sentenciaFinal);

        // Cierre de escáner
        key.close();

    }
}
