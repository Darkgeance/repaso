import java.util.Scanner;

public class ParImpar {
    public static Boolean parImpar(int n) {
        return n % 2 == 0;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n = input.nextInt();
        if (parImpar(n)==Boolean.TRUE){
            System.out.println("es par");
        }else{
            System.out.println("impar");
        }
    }
}
