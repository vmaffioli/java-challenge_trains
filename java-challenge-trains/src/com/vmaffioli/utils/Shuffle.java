package com.vmaffioli.utils;

public class Shuffle {
	public static String getShuffle(String s) {
		return shuffle(s);
	}
	private static String shuffle(String s) {
		String shuffledString = "";
		while (s.length() != 0) {
			int index = (int) Math.floor(Math.random() * s.length());
			char c = s.charAt(index);
			s = s.substring(0, index) + s.substring(index + 1);
			shuffledString += c;
		}
		return shuffledString;
	}

}
