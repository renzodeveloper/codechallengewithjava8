package com.codechallengewithjava8.api.e2024.threads.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadTest {

	public static void main(String[] args) {
		// Creamos un pool usando newFixedThreadPool() que crea
		// un pool de hilos con el numero de hilos que le pasemos
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		// Añadimos 100 hilos al executor, que se iran ejecutando
		// de 2 en 2 cogiendo cado uno de los hilos del pool
		for (int i = 0; i < 100; i++) {
			executor.execute(new MyThread(i));
		}
		
		// Finalizamos el ExecuteService
		executor.shutdown();
	}
}
