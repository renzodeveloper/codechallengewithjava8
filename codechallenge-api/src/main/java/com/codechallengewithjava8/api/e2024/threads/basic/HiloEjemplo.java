package com.codechallengewithjava8.api.e2024.threads.basic;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class HiloEjemplo extends Thread {

	@Override
	public void run() {
		try {
			int randomNum = ThreadLocalRandom.current().nextInt(2000, 5000);
			
			System.out.println("Hola soy un hilo "+LocalDateTime.now());
			Thread.sleep(randomNum);
			System.out.println("Adios soy un hilo "+LocalDateTime.now());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
