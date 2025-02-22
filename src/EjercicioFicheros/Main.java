package EjercicioFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void leerArchivo() {
        try {
            File archivo = new File("src/EjercicioFicheros/archivo.txt");
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                String texto = lector.nextLine();
                System.out.println(texto);
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
            e.printStackTrace();
        }
    }


    public static void escribirArchivo(String contenido) {
        try {
            FileWriter escritor = new FileWriter("src/EjercicioFicheros/archivo.txt", true);
            escritor.write(contenido);
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Leyendo archivo:");
        leerArchivo();

        System.out.println("\nEscribiendo en el archivo, introduzca un texto: ");
        Scanner teclado = new Scanner(System.in);
        String input = teclado.nextLine();
        escribirArchivo( input+"\n");

        System.out.println("Contenido después de escribir:");
        leerArchivo();
    }
}
