package sorting;

public class HeapSort {

	public static int[] max_heap(int arr[],int length) {
		for(int j=0;j<arr.length;j++) {  
			for(int i=0;i<length;i++) { 
				int temp=(int)(Math.floor((i-1)/2));
				if(arr[i]>arr[temp]) {
					int swap=arr[i];
					arr[i]=arr[temp];
					arr[temp]=swap;
				}
			}
		}
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		return arr;
	}
	
	public static int[] del_element(int arr[],int length) {
		
			int swap=arr[0];
			arr[0]=arr[length-1];
			arr[length-1]=swap;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[]= {15,30,8,10,16,50,20,60};
		int len=arr.length;
		for(int i=0;i<arr.length;i++) {
			max_heap(arr,len-i);
			System.out.println();
			del_element(arr,len-i);
			System.out.println();
		}
		

		
	}
}
