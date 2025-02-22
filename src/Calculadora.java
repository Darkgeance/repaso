import java.util.Scanner;

public class Calculadora {

    public static double sumar(double n1, double n2) {
        return n1 + n2;

    }

    public static double restar(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplicar(double n1, double n2) {
        return n1 * n2;

    }

    public static double dividir(double n1, double n2) {
        return n1 / n2;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        double n1 = input.nextDouble();
        System.out.print("Introduce otro numero: ");
        double n2 = input.nextDouble();
        System.out.println("introduce la operacion \n1) Suma \n2) Resta \n3) Multiplicar \n4) Dividir");
        int operacion = input.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("El resultado de la suma de " + n1 + " y " + n2+ " es "+sumar(n1,n2));
            case 2:
                System.out.println("El resultado de la resta de " + n1 + " y " + n2+ " es "+restar(n1,n2));
            case 3:
                System.out.println("El resultado de la multiplicacion de " + n1 + " y " + n2+ " es "+multiplicar(n1,n2));
            case 4:
                System.out.println("El resultado de la division de " + n1 + " y " + n2+ " es "+dividir(n1,n2));
        }

    }
}
