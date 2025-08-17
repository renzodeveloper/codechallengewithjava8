package com.codechallengewithjava8.api.e2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FindPossiblePins {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter wr = new PrintWriter(System.out);
    	String pin = br.readLine();
    	
    	String[] out_ = solution(pin);
    	for(int i_out_=0; i_out_<out_.length; i_out_++){
    		System.out.println(out_[i_out_]);
    	}
    	
    	wr.close();
    	br.close();
    }

    private static String[] solution(String pin) {
		List<String> possiblePins = getPINs(pin);
		String[] result = new String[possiblePins.size()];
		possiblePins.toArray(result);
		return result;
	}

	static List<String> getPINs(String pin) {
        String[] adjacentDigits = {
            "08",
            "124",
            "1235",
            "236",
            "1457",
            "24568",
            "3569",
            "478",
            "05789",
            "689"
        };

        List<String> result = new ArrayList<>();
        if (pin.length() == 0) {
            return result;
        }

        List<String> partialResults = getPINs(pin.substring(1));
        int digit = pin.charAt(0) - '0';

        for (char c : adjacentDigits[digit].toCharArray()) {
            if (partialResults.isEmpty()) {
                result.add(String.valueOf(c));
            } else {
                for (String partial : partialResults) {
                    result.add(c + partial);
                }
            }
        }

        return result;
    }
}
