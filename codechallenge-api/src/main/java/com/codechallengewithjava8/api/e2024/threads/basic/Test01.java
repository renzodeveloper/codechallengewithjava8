package com.codechallengewithjava8.api.e2024.threads.basic;

public class Test01 {
	
	public static void main(String[] args) {
		System.out.println("Hola soy el hilo principal");
		
		HiloEjemplo hiloEjemplo = new HiloEjemplo();
		hiloEjemplo.start();
		
		EjecutableEjemplo ejecutableEjemplo = new EjecutableEjemplo();
		Thread thread = new Thread(ejecutableEjemplo);
		thread.start();
		
		try {
			hiloEjemplo.join();
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Adios soy el hilo principal");
	}

}
