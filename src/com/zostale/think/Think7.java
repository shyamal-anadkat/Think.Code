package com.zostale.think;

import java.util.Arrays;
import java.util.Random;

/**
 * Suffle Set of Numbers without dups
 * @author SAnadkat
 *
 */
public class Think7 {

	static int[] nums;
	public static void main(String [] args) {

		nums = new int[] {1,2,3,4,5,6,7,8,9,10};
		Think7 obj = new Think7(nums);

		//int[] reset = obj.reset();
		int[] shuffled = obj.shuffle();
		System.out.println(Arrays.toString(shuffled));


	}
	public Think7 (int[] nums) {}

	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		return nums;
	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle() {
		int[] result = nums;
		int size = nums.length;

		Random rnd = new Random();
		for (int i = size - 1; i > 0; i --) {
			
			int index = rnd.nextInt(i+1);
			//swap
			int tmp = result[index];
			result[index] = result[i];
			result[i] = tmp;
		}

		return result;
	}


}
