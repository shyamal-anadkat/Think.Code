package com.zostale.think;

//Reverse a string without StringBuilder or such stuff 
/**
 * @author Shyamal
 *
 */
public class Think4 {
	public static void main(String[] args) {

		long startTime1 = System.nanoTime();
		System.out.println(reverse1("hellohello123@#hi"));
		long stopTime1 = System.nanoTime();
		System.out.println("Method 1: " + (stopTime1 - startTime1));

		long startTime2 = System.nanoTime();
		System.out.println(reverse2("hellohello123@#hi"));
		long stopTime2 = System.nanoTime();
		System.out.println("Method 2: " + (stopTime2 - startTime2));
	}

	/**
	 * @param orig
	 * @return
	 */
	public static String reverse1(String orig) {
		char[] s = orig.toCharArray();
		int size = s.length;
		int half = size / 2;
		for (int i = 0; i < half; i++) {
			char temp = s[i];
			s[i] = s[size - 1 - i];
			s[size - 1 - i] = temp;
		}
		return new String(s);
	}

	/**
	 * @param s
	 * @return
	 */
	public static String reverse2(String s) {
		// converting string to char array
		char[] charArray = s.toCharArray();
		int size = charArray.length;
		char[] tmp = new char[size];

		// reversing char array
		int i = 0;
		for (int x = (size - 1); x >= 0; x--) {
			tmp[i++] = charArray[x];
		}
		// building string out of char array
		return new String(tmp);
	}
}
