import java.util.Scanner;

public class NumeroMayor {
    public static int comparar(int n1, int n2, int n3) {
        int mayor = 0;
        if (n1 > n2) {
            if (n1 > n3){
                mayor = n1;
            }else {
                mayor =  n3;

            }
        }
        if (n2>n1){
            if (n2>n3){
                mayor = n2;
            }else {
                mayor = n3;

            }
        }

    return mayor;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un numero ");
        int n1 = input.nextInt();
        System.out.print("Introduce un numero ");
        int n2 = input.nextInt();
        System.out.print("Introduce un numero ");
        int n3 = input.nextInt();
        System.out.print("El numero mayor es "+comparar(n1,n2,n3));

    }
}
