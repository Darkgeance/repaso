package EjercicioVehiculo;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto();
        Coche coche = new Coche();

        coche.arrancar();
        coche.acelerar();
        coche.circular();
        coche.frenar();
        coche.detener();

        System.out.println();

        moto.arrancar();
        moto.acelerar();
        moto.circular();
        moto.frenar();
        moto.detener();
    }
}
