import java.util.Scanner;

public class ConversorGrados {
    public static void convertirAFahrenheit(double grados) {
        System.out.println(grados * 9/5 + 32);

    }
    public static void convertirACelsius(double grados) {
        System.out.println((grados-32) * 5/9 );

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seleccione una opcion \n1)Celsius a fahrenheit \n2)Farenheit a celsius");
        int seleccion;
        do {
            seleccion = input.nextInt();
        } while (seleccion != 1 && seleccion != 2);
        System.out.print("Introduce los grados: ");
        double grados = input.nextDouble();
        if (seleccion ==1){
            convertirAFahrenheit(grados);
        }
        if (seleccion ==2){
            convertirACelsius(grados);
        }
    }

}
