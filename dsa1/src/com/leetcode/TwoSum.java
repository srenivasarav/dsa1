package com.leetcode;

public class TwoSum {

	// The Time Complexity is is O(n2)<-->[n square]
	//Space Complexity is O(1)
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] twoSum = twoSum(nums, target);
		System.out.println(" " + twoSum[0] + " " + twoSum[1]);
	}

	private static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j };
				}

			}
		}
		throw new IllegalArgumentException("No Sum is not equal");
		// TODO Auto-generated method stub

	}

}
