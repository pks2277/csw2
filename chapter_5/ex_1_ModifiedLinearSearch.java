package chapter_5;

public class ex_1_ModifiedLinearSearch {
	public static boolean linearSearchSorted(int arr[],int size,int key) {
		for(int i=0;i<size;i++) {
			if(key==arr[i]) {
				return true;
			}
			else if(key<arr[i]) {
				return false;
			}
		}
		return false;
	}
	
	public static boolean BinarySearch(int arr[],int n,int key) {
		int low=0;
		int high=n-1;
		int mid;
		while(low<=high) {
			mid=(high+low)/2;
			if(arr[mid]==key) {
				return true;
			}
			else if(arr[mid]<key) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]= {5,6,7,8,9,11};
		int key=5;
		int size=arr.length;
		System.out.println(linearSearchSorted(arr,size,key));
		System.out.println(BinarySearch(arr,size,key));
	
	}
}
