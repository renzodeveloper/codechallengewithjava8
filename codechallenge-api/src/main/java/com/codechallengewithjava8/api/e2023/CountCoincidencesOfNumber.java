package com.codechallengewithjava8.api.e2023;

import java.util.HashMap;

public class CountCoincidencesOfNumber {

	public static void main(String[] args) {
		int[] array = {34,31,34,77,82};
		int result = NumMasPopular(array, 5);
		System.out.println(result);
	}

	public static int NumMasPopular(int[] array, int length) {
		if (length == 1) {
			return array[0];
		}

		HashMap<Integer, Integer> countMap = new HashMap<>();
		int mostFrequent = array[0];
		int maxCount = 1;

		for (int i = 0; i < length; i++) {
			int current = array[i];
			int count = countMap.getOrDefault(current, 0) + 1;
			countMap.put(current, count);

			if (count == maxCount) {
				mostFrequent = Math.min(mostFrequent, current);
			} else if (count > maxCount) {
				mostFrequent = current;
				maxCount = count;
			}
		}

		return mostFrequent;
	}
}
