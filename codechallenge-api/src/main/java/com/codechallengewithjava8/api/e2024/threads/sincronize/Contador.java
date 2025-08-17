package com.codechallengewithjava8.api.e2024.threads.sincronize;

public class Contador {

	private int contador = 0;
	
	public void sumar() {
		synchronized (this) {
			contador++;			
		}
	}

	public int getContador() {
		return contador;
	}
	
}
