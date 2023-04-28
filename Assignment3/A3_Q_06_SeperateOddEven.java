package Assignment3;

public class A3_Q_06_SeperateOddEven {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int left=0;
		int right=arr.length;

		for(int i=0;i<arr.length;i++) {
			if(arr[left]%2==0 && arr[right]%2!=0) {
				left++;
				right--;
			}
			if(arr[left]%2!=0 && arr[right]%2==0) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
		}
		for(int e:arr) {
			System.out.print(e+" ");
		}
	}

}
