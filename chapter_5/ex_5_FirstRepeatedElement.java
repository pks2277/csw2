package chapter_5;

public class ex_5_FirstRepeatedElement {
	public static void FirstRepeated(int[] arr,int size) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
				 	System.out.println(arr[i]);
				}
			}
		}	
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,5,3,2};
		int size=arr.length;
		FirstRepeated(arr,size);
	}
}
