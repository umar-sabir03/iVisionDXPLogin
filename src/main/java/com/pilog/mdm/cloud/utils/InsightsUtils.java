package com.pilog.mdm.cloud.utils;


import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InsightsUtils {

	private static final SecureRandom SECURE_RANDOM = new SecureRandom();
	public static String generateId() {
		return RandomStringUtils.randomAlphanumeric(32).toUpperCase();
	}

	public String generateRandomHex(int length) {
		byte[] randomBytes = new byte[length / 2];
		SECURE_RANDOM.nextBytes(randomBytes);
		BigInteger number = new BigInteger(1, randomBytes);
		return number.toString(16).toUpperCase();
	}
	

     public static String getCurrentDateTime() {
		LocalDateTime now = LocalDateTime.now();
		return now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	}

}

//byte test2[] = Base64.getDecoder().decode(imgStr);