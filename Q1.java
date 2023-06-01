package questions;

import java.util.HashMap;
import java.util.Map;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,5,9,7};
		int[] a=twoSum(arr,11);
		for(int i: a) {
			System.out.print(i+" ");
	}
	}
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(target-nums[i])) {
				return new int[] {map.get(target-nums[i]),i};
			}
			map.put(nums[i], i);
		}
      return new int[] {};

}

}
