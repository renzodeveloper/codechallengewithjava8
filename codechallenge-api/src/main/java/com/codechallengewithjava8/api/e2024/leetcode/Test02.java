package com.codechallengewithjava8.api.e2024.leetcode;

public class Test02 {
	
	public static void main(String[] args) {
		String input="aaabbbbbcc";
		System.out.println(encode(input));
	}
	
	private static String encode(String input) {		
		if (input == null && input.length() == 0) {
			return "";
		}
		
		char[] inputChar = input.toCharArray();
		int counter = 0;
		char previousChar = 0;
		
		StringBuffer sbuffer = new StringBuffer();
		
		for(char current : inputChar) {
			if(current == previousChar)
				counter++;
			else {
				if(previousChar != 0)
					sbuffer.append(counter).append(previousChar);
				counter=1;
				previousChar=current;
			}		
		}

		sbuffer.append(counter).append(previousChar);
		return sbuffer.toString();
	}

}
