package questions;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,3,5,6};
System.out.println(binarySearch(arr,5));
	}
	public static int binarySearch(int[] arr,int target) {
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return -1;
	}

}
