package questions;

import java.util.HashSet;
import java.util.Set;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,9,9};
     System.out.println(isDuplicate(arr));
    System.out.println(isDuplicateEfficient(arr)); ;
	}
	
	public static boolean isDuplicate(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					count++;
					break;
				}
			}
		}
		if(count==0) {
			return false;
		}else {
			return true;
		}
	}
	public static boolean isDuplicateEfficient(int[] arr) {
		Set<Integer> hs=new HashSet<Integer>(); 
		for(int num : arr) {
			if(hs.contains(num)) {
				return true;
			}
			hs.add(num);
		}
		return false;
	}

}
