package com.codechallengewithjava8.api.e2024.problems;

public class SerieEvenNumbers {

	public static void printing() {
	
		// Even
		// 2,4,6,8,...
		int aux;
		for (int i = 1; i < 10; i++) {		
			aux = 2*i;
			System.out.println("number: "+aux);
		}
	}
	
	public static void main(String[] args) {
		printing();
	}
}
