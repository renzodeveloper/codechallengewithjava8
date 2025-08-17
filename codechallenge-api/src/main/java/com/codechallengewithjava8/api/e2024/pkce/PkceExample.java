package com.codechallengewithjava8.api.e2024.pkce;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PkceExample {

	public static void main(String[] args) {
		
		try {
			PkceUtil util = new PkceUtil();			
			String codeVerifier = util.generateCodeVerifier();
			System.out.println("codeVerifier: "+codeVerifier);
			String codeChallenge = util.generateCodeChallenge(codeVerifier);
			System.out.println("codeChallenge: "+codeChallenge);
			
		} catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {

			Logger.getLogger(PkceExample.class.getName()).log(Level.SEVERE, null, e);
		}
	}
}
