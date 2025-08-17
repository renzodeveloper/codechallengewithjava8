package com.codechallengewithjava8.api.e2023;

public class TrappingWater {

	public static void main(String[] args) {
		new TrappingWater();
	}

	public TrappingWater() {
		int[] input = { 3, 0, 0, 3 };// 10
		int result = trappingWater(input);
		int result2 = maxWater(input);
		System.out.println(result);
		System.out.println(result2);
	}

	private int trappingWater(int[] input) {

		if (input == null || input.length < 6)
			return 0;

		int result = 0;// numbers of units of water

		int leftPointer = 0;// left pointer to start reading at the initial element
		int rightPointer = input.length - 1;// right pointer to start reading at the final element

		int leftMax = input[leftPointer];// max high from left side of the left pointer
		int rightMax = input[rightPointer];// max high from right side of the right pointer

		while (leftPointer < rightPointer) {
			if (leftMax < rightMax) {
				leftPointer++;
				leftMax = Math.max(leftMax, input[leftPointer]);
				result += leftMax - input[leftPointer];
			} else {
				rightPointer++;
				rightMax = Math.max(rightMax, input[rightPointer]);
				result += rightMax - input[rightPointer];
			}
		}

		return result;
	}

	public static int maxWater(int[] inputArray) {
		if (inputArray == null)
			return 0;
		
		if (inputArray.length < 3)
			return 0;
		
		int maxWater = 0;// To store the maximum water that can be stored

		// For every element of the array except first and last element
		for (int i = 1; i < inputArray.length - 1; i++) {

			// Find maximum element on its left side
			int left = inputArray[i];
			for (int j = 0; j < i; j++) {
				left = Math.max(left, inputArray[j]);
			}

			// Find maximum element on its right side
			int right = inputArray[i];
			for (int j = i + 1; j < inputArray.length; j++) {
				right = Math.max(right, inputArray[j]);
			}

			// Update maximum water value
			maxWater += Math.min(left, right) - inputArray[i];
		}
		return maxWater;
	}
}
