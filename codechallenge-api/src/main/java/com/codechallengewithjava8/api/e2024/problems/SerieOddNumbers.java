package com.codechallengewithjava8.api.e2024.problems;

public class SerieOddNumbers {

	public static void printing() {
	
		// Odd
		// 1,3,5,7,9,...
		int aux;
		for (int i = 1; i < 10; i++) {		
			aux = 2*i-1;
			System.out.println("number: "+aux);
		}
	}
	
	public static void main(String[] args) {
		printing();
	}
}
