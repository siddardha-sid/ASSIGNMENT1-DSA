package questions;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,9};
int[] a=print(arr); 
for(int i : a) {
	System.out.print(i+" ");
}
	}
	public static int[] print(int[] arr) {
		String num="";
		for(int i=0;i<=arr.length-1;i++) {
			num=num+arr[i];
		}
		System.out.println(num);
	    int temp=Integer.parseInt(num);
	    int incrementNumber=temp%10;
	    System.out.println(incrementNumber);
	   arr[arr.length-1]=++incrementNumber;
	   return arr;
		
		
	}

}
