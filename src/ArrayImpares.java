import java.util.ArrayList;
import java.util.Scanner;

public class ArrayImpares {
    public static void arrayImpares(int n) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i <= n; i++){
            if(i % 2!= 0){
                lista.add(i);

            }
        }

        System.out.print(lista);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n = input.nextInt();
        arrayImpares(n);
    }
}
