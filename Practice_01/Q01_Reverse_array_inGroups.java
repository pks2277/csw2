package Practice_01;

public class Q01_Reverse_array_inGroups {

	public static void reverse(int[] arr,int k ) {
		int length=arr.length;
		for(int i=0;i<length;i=i+k) {
				int start=i;
				int end=Math.min(i+k-1, length-1);
				while(start<=end) {
					int temp=arr[start];
					arr[start]=arr[end];
					arr[end]=temp;
					start++;
					end--;
				}
			
		}
		
	}

	public static void main(String[] args) {
		int[] arr= {4,3,2,1,8,7,6,5,10,9};
		int k=4;
		reverse(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}

}



