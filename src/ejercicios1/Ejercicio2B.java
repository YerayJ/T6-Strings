package ejercicios1;

import java.util.Scanner;

public class Ejercicio2B {
    public static void main(String[] args) {
        // Creación de Constante con la contraseña
        String passwd;
        String usuarioString;

        // Inicializa la String para guardar las letras
        String muestraUsuario;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // El jugador 1 introduce la contraseña
        System.out.println("Jugador 1 introduce la contraseña ");
        passwd = key.next();

        // Comprueba si acertamos la contraseña
        do {
            System.out.println("Jugador 2 acierta la contraseña ");
            usuarioString = key.next();

            // Inicializa la String para guardar las letras
            muestraUsuario = "";

            // Bucle que recorre la String
            for (int i = 0; i < passwd.length(); i++) {
                // Compara la letra de la frase del usuario con la de la contraseña
                if (usuarioString.length() > i && usuarioString.charAt(i) == passwd.charAt(i)) {
                    muestraUsuario += passwd.charAt(i);
                } else {
                    muestraUsuario += "*";
                }
            } // Fin de bucle

            // Muestra el resultado
            System.out.println(muestraUsuario);

            // Compara las cadenas
        } while(!muestraUsuario.equals(passwd));

        // Muestra que ha ganado
        System.out.println("\n HAS GANADO");

    }
}
