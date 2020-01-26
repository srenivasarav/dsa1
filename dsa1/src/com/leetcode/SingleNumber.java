package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	
	public static void main(String[] args) {
		int[] arr = {4,1,2,1,2};
		System.out.println(singleNumber(arr));
	}

	public static int singleNumber(int[] num) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			if (map.containsKey(num[i])) {
				map.remove(num[i]);
			}else {
				map.put(num[i], i);
			}
			
		}
		return (int) map.keySet().toArray()[0];
	}

}
