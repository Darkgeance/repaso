package EjercicioBanco;

public class CuentaBancaria {
    private int saldo;

    public void depositar(int dinero){
        this.saldo += dinero;
    }

    public void retirar(int dinero) {
        try {
            if (dinero > saldo) {
                throw new SaldoInsuficienteException("No tienes suficiente saldo para realizar esta operación.");
            }
            saldo -= dinero;
            System.out.println("Has retirado " + dinero + ". Saldo restante: " + saldo);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mostrarSaldo(){
        System.out.println("Saldo actual: " + this.saldo);
    }
}
