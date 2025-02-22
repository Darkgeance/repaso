package EjercicioVehiculo;

public class Coche implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Arrancando coche");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando coche");
    }

    @Override
    public void circular() {
        System.out.println("Circulando coche");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando coche");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo coche");
    }
}
