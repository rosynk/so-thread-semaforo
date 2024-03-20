package view;

import controller.Thread1;

import java.util.concurrent.Semaphore;

public class Main1 {
    public static void main(String[] args) {
        Semaphore semaforo = new Semaphore(1);

       Thread1[] threads = new Thread1[21];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread1(i + 1, semaforo);

            threads[i].start();
        }
    }
}