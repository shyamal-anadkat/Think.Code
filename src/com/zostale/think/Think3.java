package com.zostale.think;

/*Intersection of two arrays*/
import java.util.*;

public class Think3 {

	public static void main(String[] args) {
		int a[] = { 2, 3, 9, 7, 7, 4, 5 };
		int b[] = { 2, 3, 7, 7, 7, 7 };
		HashSet<Integer> firstSet = new HashSet<Integer>();
		HashSet<Integer> secondSet = new HashSet<Integer>();

		for (int i : a) {
			firstSet.add(i);
		}
		for (int j : b) {
			secondSet.add(j);
		}
		Iterator<Integer> it = firstSet.iterator();
		while (it.hasNext()) {
			int nxt = it.next();
			if (!secondSet.contains(nxt)) {
				it.remove();
			}
		}
		int[] outcome = new int[firstSet.size()];
		int i = 0;
		for (int j : firstSet) {
			outcome[i++] = j;
		}
		System.out.println(Arrays.toString(outcome));
	}
	
	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> firstSet = new HashSet<Integer>();
		HashSet<Integer> secondSet = new HashSet<Integer>();

		for (int i : nums1) {
			firstSet.add(i);
		}
		for (int j : nums2) {
			secondSet.add(j);
		}
		Iterator<Integer> it = firstSet.iterator();
		while (it.hasNext()) {
			int nxt = it.next();
			if (!secondSet.contains(nxt)) {
				it.remove();
			}
		}
		int[] outcome = new int[firstSet.size()];
		int i = 0;
		for (int j : firstSet) {
			outcome[i++] = j;
		}
		return outcome;
    }
}
