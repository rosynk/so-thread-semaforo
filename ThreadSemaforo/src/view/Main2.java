package view;

import controller.Thread2;

import java.util.concurrent.Semaphore;

public class Main2 {
    public static void main(String[] args) {
        final int COZIMENTO_SIMULTANEOS = 5;
        final int ENTREGAS_POR_VEZ = 1;
        Semaphore semaforoCozimento = new Semaphore(COZIMENTO_SIMULTANEOS);
        Semaphore semaforoEntrega = new Semaphore(ENTREGAS_POR_VEZ);

        Thread2[] pratos = new Thread2[10];
        for (int i = 0; i < pratos.length; i++) {
            pratos[i] = new Thread2(i, semaforoCozimento, semaforoEntrega);
            pratos[i].start();
        }
    }
}