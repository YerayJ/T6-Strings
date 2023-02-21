package ejercicios1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        // Creación de variable que guarda lo que el usuario introduce por teclado
        String word;

        // Creación de variable que guarda la frase completa
        String phrase = "";

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Pide al usuario la word
        System.out.println("Deme una frase palabra por palabra: ");
        word = key.next();

        // Bucle que se ejecuta mientras el usuario no ponga fin
        while (!word.equalsIgnoreCase("fin")){
            // Guarda la frase juntando las palabras introducidas por el usuario
            phrase += word + " ";

            // Pide palabra
            word = key.next();
        }

        // Muestra la frase completa
        System.out.println("La frase completa es : " + phrase);

    }
}
