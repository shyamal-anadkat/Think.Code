package com.zostale.think;

/**
 * An Algorithm to simply compress a single string 
 * @author user
 *
 */
public class Think6 {
	public static void main(String[] args) {
		String sample = "aaaaabbbbbyyyyyydfffffppppp";
		System.out.println(simpleCompress(sample));

	}
	/**
	 * 
	 * @param input
	 * @return
	 */
	public static String simpleCompress (String input) {
		StringBuilder compressed = new StringBuilder();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {	
			count++;
			if((i + 1) >= input.length() || input.charAt(i) != input.charAt(i+1)) {
				compressed.append(input.charAt(i));
				compressed.append(count);
				count = 0; 
			}
		}
		if (compressed.length() < input.length()) {
			return compressed.toString();
		}
		else {
			return input;
		}

	}

}
