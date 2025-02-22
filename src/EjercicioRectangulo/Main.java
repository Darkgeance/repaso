package EjercicioRectangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el alto del rectangulo: ");
        int altura = input.nextInt();
        System.out.print("Introduce el ancho del rectangulo: ");
        int ancho = input.nextInt();
        Rectangulo rectangulo = new Rectangulo(altura, ancho);

        // Concatenando el texto con el resultado
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
        System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
    }
}