import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumeroEnArray {
    public static void main(String[] args) {
        int[] array = {1,10,20,15,2,50,30,60,2};
        encontrarNumero(array,2);
    }

    public static void encontrarNumero(int[] array,int n) {
        for (int i = 0; i < array.length ; i++) {
            if (n ==array[i]){
                System.out.println(n + " se encuentra en la posicion " +i);
            }
        }
    }
}