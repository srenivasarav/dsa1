package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution2 {

	
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11,8, 15 };
		int target = 9;
		int[] twoSum = twoSum(nums, target);
		System.out.println(" " + twoSum[0] + " " + twoSum[1]);
	}

	private static int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {i,map.get(complement)};
			}
		}
		
		throw new IllegalArgumentException("No Two Sum");
	}

	
}
