package EjercicioVehiculo;

public class Moto implements Vehiculo{
    @Override
    public void arrancar() {
        System.out.println("La moto está arrancando");
    }

    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando");
    }

    @Override
    public void circular() {
        System.out.println("La moto está circulando");

    }

    @Override
    public void frenar() {
        System.out.println("La moto está frenando");
    }

    @Override
    public void detener() {
        System.out.println("La moto está deteniendose");

    }
}
