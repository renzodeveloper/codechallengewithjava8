package com.codechallengewithjava8.api.e2024.problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SeriePrimeNumbers {

	public static void printing() {
	
		// Prime
		// 2,3,5,7,11,13,17,19,23,...
		// int aux;
		for (int i = 2; i <= 10; i++) {
			for (int j = 2; j <= i; j++) {
				if (j==i)
					System.out.println("number: "+i);
				if (i%j==0) 
					break;
			}			
		}
	}
	
	public static void printing(Integer limit, Integer param) {
		
		// Prime
		// 2,3,5,7,11,13,17,19,23,...
		int aux=0;
		for (int i = 2; i <= limit; i++) {
			for (int j = 2; j <= i; j++) {
				if (param!=null && aux==param)
					break;
				if (j==i) {
					aux++;
					System.out.println("number["+aux+"]: "+i);					
				}
				if (i%j==0) 
					break;
			}			
		}
	}
	
	public static List<Integer> buildingListWithPrimeNumbers(Integer limit, Integer param) {
		
		// Prime
		// 2,3,5,7,11,13,17,19,23,...
		List<Integer> result = new ArrayList<Integer>();
		int aux=0;
		for (int i = 2; i <= limit; i++) {
			for (int j = 2; j <= i; j++) {
				if (param!=null && aux==param)
					break;
				if (j==i) {
					aux++;
					//System.out.println("number["+aux+"]: "+i);
					result.add(i);
				}
				if (i%j==0) 
					break;
			}			
		}
		
		return result;
	}
	
	public static int[] buildingArrayWithPrimeNumbers(Integer limit, Integer param) {
		
		// Prime
		// 2,3,5,7,11,13,17,19,23,...
		int result[] = new int[param+1];
		int aux=0;
		for (int i = 2; i <= limit; i++) {
			for (int j = 2; j <= i; j++) {
				if (param!=null && aux==param)
					break;
				if (j==i) {
					aux++;
					//System.out.println("number["+aux+"]: "+i);
					result[aux]=i;
				}
				if (i%j==0) 
					break;
			}			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		//printing(100,null);
		//List<Integer> list = buildingListWithPrimeNumbers(1000, 20);
		//List.stream().forEach(f -> System.out.println(f));
		int[] result = buildingArrayWithPrimeNumbers(100, 4);
		System.out.println(result.length);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
