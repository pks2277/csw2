package Practice_01;

public class Q03_check_k_freq {
	public static int firstElementOccurance(int[] arr,int n,int k) {
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if (arr[i] == arr[j]) {
					count++;
			}
		}
			if(count==k) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,4,3,2,11,34,45,2,23,2};
		int n = arr.length;
		int k = 4;
		System.out.print("first Element with "+k+" occurance"+firstElementOccurance(arr, n, k));

	}

}
