package ejercicios1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Creación de Constante con la contraseña
        String passwd;
        String cad2;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // El jugador 1 introduce la contraseña
        System.out.println("Jugador 1 introduce la contraseña ");
        passwd = key.next();

        // Comprueba si acertamos la contraseña
        do {
            System.out.println("Jugador 2 acierta la contraseña ");
            cad2 = key.next();

            // Comprueba si la palabra es menor o mayor alfabéticamente
            System.out.println(passwd.compareTo(cad2)>0?"La contraseña es mayor":"La contraseña es menor");

            // Compara las cadenas
        } while(!cad2.equals(passwd));

        // Muestra que ha ganado
        System.out.println("Has ganado");

        // Cierre de escáner
        key.close();

    }
}
