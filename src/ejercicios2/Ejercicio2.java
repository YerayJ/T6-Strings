package ejercicios2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Creación de variables que contienen las Strings+
        String html, titulo, contenido;
        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Pide los valores al usuario
        System.out.println("Deme el título de su pagina web: ");
        titulo = key.nextLine();

        System.out.println("Deme el contenido de su pagina web: ");
        contenido = key.nextLine();

        // Creación del html
        html = "<html>\n<head>\n<title>" + titulo + "</title>\n</head>\n<body>\n<p>" + contenido + "</p>\n</body>\n</html>";

        // Muestra el resultado
        System.out.println(html);

        // Cierre de escáner
        key.close();

    }
}
