import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContarVocales {
    public static void contarVocales(String texto) {
        List<Character> vocales = Arrays.asList('a', 'e', 'i', 'o', 'u');

        int contador = 0;

        for (int i=0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (vocales.contains(c)){
                contador ++;
            }
        }
        System.out.println("El texto contiene " + contador + " vocales");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("introduce un texto: ");
        String texto = input.nextLine();
        contarVocales(texto);
    }
}
