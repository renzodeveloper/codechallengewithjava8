package com.codechallengewithjava8.api.e2024.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		int parameter = 5;
		int input[] = { 1, 2, 3, 4 };
		int size = input.length;
		List<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			// System.out.println(arrayParam[i]);
			for (int j = i + 1; j < size; j++) {
				if (input[i] + input[j] == parameter) {
					// System.out.println(i +" - "+j);
					output.add(i);
					output.add(j);
				}
			}
		}
		for (int i = 0; i < output.toArray().length; i++) {
			System.out.println(output.toArray()[i]);
		}
	}
}
