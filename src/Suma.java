import java.util.Scanner;

public class Suma {
    public static int sumar(int a,int b) {
        return a+b;

    }

    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n1 = input.nextInt();
        System.out.print("Introduce otro numero: ");
        int n2 = input.nextInt();
        System.out.println("El resultado de " + n1 + " y " + n2 + " es : "+sumar(n1,n2));

    }
}
