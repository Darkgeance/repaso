import java.lang.reflect.Array;
import java.util.Arrays;

public class OrdenarArray {
    public static void main(String[] args) {
        int[] array = {1,10,20,15,2,50,30,60};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}