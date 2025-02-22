import java.util.Scanner;

public class InvertirCadena {
    public static void invertir(String texto) {
        String invertida = "";
        for (int i = texto.length() -1; i >= 0; i--){
            invertida += texto.charAt(i);
        }
        System.out.println("Cadena invertida: " + invertida);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String texto = input.nextLine();
        invertir(texto);
    }
}
