package com.zostale.think;

import java.util.*;
public class Think5 {

	/*Given an array of integers, every element appears twice except for one. Find that single one. */
	//Linear time ? 
	public static void main(String[] args) {
		int[] testArray = {2,3,4,2,8,3,4,55,55,6,6};
		System.out.println(singleNumber1(testArray));
		System.out.println(singleNumber2(testArray));
	}
	public static int singleNumber1(int[] nums) {
		HashSet<Integer> unique = new HashSet<Integer>();
		
		for (int i = 0; i < nums.length ; i ++) {
			if (!unique.contains(nums[i])) {
				unique.add(nums[i]);
			}
		}
		System.out.println(unique);
		Iterator<Integer> iter = unique.iterator();
		int outcome = iter.next();
		return outcome;
	}
	
	public static int singleNumber2(int[] nums) {
		int outcome = 0; 
		for (int i = 0; i < nums.length ; i ++) {
			outcome = outcome ^ nums[i];
		}
		return outcome;
	}

}
