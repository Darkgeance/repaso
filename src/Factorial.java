import java.util.Scanner;

public class Factorial {
    public static void factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        System.out.print("El factorial de " + n + " es " + resultado);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n = input.nextInt();
        factorial(n);
    }
}
