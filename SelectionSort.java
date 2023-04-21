package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {10,13,5,67,16};
		for(int i=0;i<arr.length;i++) {
			int smallest_index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[smallest_index]) {
					smallest_index=j;
					int temp=arr[smallest_index];
					arr[smallest_index]=arr[i];
					arr[i]=temp;
				}
			}		
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}
