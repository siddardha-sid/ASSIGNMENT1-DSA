package questions;

import java.util.*;

class myclass {
    public int[] findErrorNums(int[] nums) {
        int[] freqMap = new int[nums.length + 1];
        
        for (int num : nums) {
            freqMap[num]++;
        }
        
        int duplicate = 0;
        int missing = 0;
        
        for (int i = 1; i < freqMap.length; i++) {
            if (freqMap[i] == 2) {
                duplicate = i;
            }
            if (freqMap[i] == 0) {
                missing = i;
            }
        }
        
        return new int[] {duplicate, missing};
    }
}


public class Q8 {

	public static void main(String[] args) {
	
int[] nums = {1, 2, 2, 4};
        
        myclass mc=new myclass();
        int[] result = mc.findErrorNums(nums);
        
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
	}

}
