package sorting;

public class BubbleSort {
	public static void swap(int i,int j) {
		
	}

	public static void main(String[] args) {
		int arr[]= {9,3,1,5,7};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int random=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=random;
				}
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
