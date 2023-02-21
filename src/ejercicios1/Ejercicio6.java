package ejercicios1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Creación de variable que guarda lo que el usuario introduce por teclado
        String word;

        // Creación de variable que guarda la frase completa
        String phrase;

        // Variable auxiliar que guarda la posición
        int pos;

        // Variable auxiliar que guarda la posición de la palabra
        int posPalabra = 0;

        // Variable contador
        int contador = 0;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Pide al usuario las variables por teclado
        System.out.println("Deme una frase: ");
        phrase = key.nextLine();
        System.out.println("Deme una palabra y le diré cuantas veces aparece: ");
        word = key.next();

        // Calcula la posición buscando en la posicion de la primera letra de la palabra que queremos buscar
        pos = phrase.indexOf(word, posPalabra);

        // Comprueba cuantas veces aparece la palabra en la frase
        while (pos >= 0) {
            // Suma uno al contador
            contador++;
            // La pospalabra se actualiza restando la posición donde ha encontrado la palabra más la longitud de la palabra
            posPalabra = word.length() + pos;
            // Calcula la posición buscando en la posicion de la primera letra de la palabra que queremos buscar
            pos = phrase.indexOf(word, posPalabra);
        }

        // Muestra el resultado
        System.out.println("La palabra se repite un total de: " + contador + " veces");
    }
}
