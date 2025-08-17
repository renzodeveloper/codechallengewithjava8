package com.codechallengewithjava8.api.e2025;

import java.util.HashMap;

public class E01TwoSumB {
	
    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int complement;
        for (int i=0; i<nums.length; i++) {
            complement = target - nums[i];
            
            if (map.containsKey(complement))
            	return new int[] {map.get(complement), i};
            	
            map.put(nums[i], i);            
        }
        return new int[0];
    }
    
    private static void printingArrayOfNumbers(int[] nums) {
    	StringBuffer result = new StringBuffer("["); 
    	for (int i=0; i<nums.length; i++) {
    		result.append(nums[i]).append(",");
    	}
    	System.out.println(result.append("]").toString());
    }
    
	public static void main(String[] args) {
		int[] case1 = {2,7,11,15};
		printingArrayOfNumbers(twoSum(case1,9));
		
		int[] case2 = {3,2,4};
		printingArrayOfNumbers(twoSum(case2,6));
		
		int[] case3 = {3,3};
		printingArrayOfNumbers(twoSum(case3,6));
	}
}
