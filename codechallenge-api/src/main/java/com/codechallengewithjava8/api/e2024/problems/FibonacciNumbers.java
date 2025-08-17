package com.codechallengewithjava8.api.e2024.problems;

public class FibonacciNumbers {

	public static void printing() {
	
		// Fibonacci
		// 1, 1, 2, 3, 5, 8, 13, 21, 34		
		int a = 0;//2 numeros antes
		int b = 1;//1 numero antes
		int aux = 1;//numero actual
		System.out.println("number: "+aux);		
		for (int i = 0; i < 10; i++) {	
			System.out.println("number: "+aux);
			a = b;
			b = aux;
			aux = a + b;
		}
	}
	
	public static void main(String[] args) {
		printing();
	}
}
