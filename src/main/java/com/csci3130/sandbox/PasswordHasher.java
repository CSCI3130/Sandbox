package com.csci3130.sandbox;

import java.security.MessageDigest;
import java.io.*;
import java.security.*;

public class PasswordHasher {

	public String hash(String pass) throws UnsupportedEncodingException, 
				 NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		return new String(md.digest(pass.getBytes("UTF-8")));
	}
}
