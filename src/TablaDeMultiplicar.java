import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void tablaDeMultiplicar(int numero){
        for (int i = 1; i<11; i++){
            System.out.println(numero + " * " +i +" = " +numero*i);

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un numero");
        int numero = input.nextInt();
        tablaDeMultiplicar(numero);
    }
}
