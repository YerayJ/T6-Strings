package ejercicios1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Creación de variable que contiene la frase
        String cad1,cad2;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Pide String al usuario
        System.out.println("Introduce la primera cadena: ");
        cad1 = key.next();

        System.out.println("Introduce la segunda cadena: ");
        cad2 = key.next();

        // Compara las cadenas
        System.out.println(cad1.length()>cad2.length()?cad2 + " es más pequeña": cad1 + " es más pequeña");
    }
}
