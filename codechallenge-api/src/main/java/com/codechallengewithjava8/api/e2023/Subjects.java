package com.codechallengewithjava8.api.e2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subjects {

	public Subjects() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void main(String[] args) {
		List<String> subjects = Arrays.asList("free prize worth millions", "ten tips for a carefree lifestyle");
		List<String> spam_words = Arrays.asList("free", "money", "win", "millions");
		String[] result = spamDetection(subjects, spam_words);
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static String[] spamDetection(List<String> subjects, List<String> spam_words) {
		// TODO Auto-generated method stub
		String[] results = new String[subjects.size()];
		List<String> spam_words_tmp = new ArrayList<String>();
		for (String spam_word : spam_words) {
			spam_words_tmp.add(spam_word.toLowerCase());
		}
		for (int i = 0; i < subjects.size(); i++) {
			String subject_tmp = subjects.get(i).toLowerCase();
			int spam_counter = 0;
			for (String spam_word : spam_words_tmp) {				
				if (subject_tmp.contains(spam_word))
					spam_counter++;
			}
			if (spam_counter >= 2) {
				results[i] = "spam";
			} else {
				results[i] = "not_spam";
			}				
		}
		return results;
	}
	
	
}
