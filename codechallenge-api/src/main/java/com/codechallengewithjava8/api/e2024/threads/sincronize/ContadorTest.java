package com.codechallengewithjava8.api.e2024.threads.sincronize;

public class ContadorTest {

	public static void main(String[] args) {
		Contador contador = new Contador();

		Thread hilo1 = new Thread(() -> {
			System.out.println("Inicio el hilo1");
			for (int i = 0; i < 10000; i++) {
				contador.sumar();
			}
			System.out.println("Termino el hilo1");
		});

		Thread hilo2 = new Thread(() -> {
			System.out.println("Inicio el hilo2");
			for (int i = 0; i < 10000; i++) {
				contador.sumar();
			}
			System.out.println("Termino el hilo2");
		});

		hilo1.start();
		hilo2.start();
		
		try {
			hilo1.join();
			hilo2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("El contador vale " + contador.getContador());
	}
}
