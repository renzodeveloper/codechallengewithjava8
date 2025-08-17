package com.codechallengewithjava8.api.e2024.threads.executor;

public class MyThread implements Runnable {

	private int id;
	
	public MyThread(int pId) {
		this.id = pId;
	}
	
	@Override
	public void run() {
		//Mostramos un mensaje indicando el nombre del hilo
		System.out.println("EL hilo "+this.id+" coge el pool "+Thread.currentThread().getName());
		
		//Bloqueamos el hilo un tiempo aleatorio
		try {
			Thread.sleep((int) (Math.random()*200+100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Mensaje indicando que va a dejar el pool
		System.out.println("El hilo "+this.id+" deja el pool "+Thread.currentThread().getName());
		
	}
	
	

}
