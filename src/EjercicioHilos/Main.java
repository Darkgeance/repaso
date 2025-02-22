package EjercicioHilos;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ambos hilos han terminado.");

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Hilo1 hiloasincrono1 = new Hilo1();
        Hilo2 hiloasincrono2 = new Hilo2();

        CompletableFuture<Void> futureHilo1 = CompletableFuture.runAsync(hilo1, executor);
        CompletableFuture<Void> futureHilo2 = CompletableFuture.runAsync(hilo2, executor);

        CompletableFuture.allOf(futureHilo1, futureHilo2).join();

        System.out.println("Ambos hilos han terminado.");

        executor.shutdown();

    }
}