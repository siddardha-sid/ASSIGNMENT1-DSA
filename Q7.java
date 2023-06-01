package questions;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] arr= {0,1,0,3,12};
int i=0;
for(int num : arr) {
	if(num!=0) {
		arr[i++]=num;
		
	}
}
	while(i<arr.length) {
		arr[i++]=0;
		
	}


for(int num: arr) {
	System.out.print(num+" ");
}
	}

}
