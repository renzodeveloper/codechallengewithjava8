package com.codechallengewithjava8.api.e2025;

public class E01TwoSumA {
	
    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0; i<nums.length; i++) {
            for (int j=1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
    
    private static void printingArrayOfNumbers(int[] nums) {
    	StringBuffer result = new StringBuffer("["); 
    	for (int i=0; i<nums.length; i++) {
    		result.append(nums[i]).append(", ");
    	}
    	System.out.println(result.append("]").toString());
    }
    
	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 15};
		printingArrayOfNumbers(twoSum(arr,9));
	}
}
