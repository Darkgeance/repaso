package EjercicioBanco;

public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException {
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.mostrarSaldo();

        cuentaBancaria.depositar(100);
        cuentaBancaria.mostrarSaldo();

        cuentaBancaria.retirar(1000);
        cuentaBancaria.mostrarSaldo();
    }
}
