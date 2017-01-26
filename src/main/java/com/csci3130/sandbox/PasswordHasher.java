package com.csci3130.sandbox;

import java.security.MessageDigest;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;

public class PasswordHasher {

	public String hash(String pass) throws UnsupportedEncodingException, 
				 NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		return Hex.encodeHexString(md.digest(pass.getBytes("UTF-8")));
	}
}
