package EjercicioHilos;

import java.util.ArrayList;

public class Hilo2 extends Thread {

    @Override
    public void run() {
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            System.out.println(letra);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
