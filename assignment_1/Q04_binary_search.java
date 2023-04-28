package assignment_1;

import java.util.Arrays;

public class Q04_binary_search {
	public static int BinarySearch(int arr[], int size, int value) {
		int mid;
		int low = 0;
		int high = size - 1;
		while (low <= high) {
			
			mid = low + (high - low) / 2; 
			if (arr[mid] == value) {
				return mid;
			}
			else {
				if (arr[mid] < value) {
					low = mid + 1;
				}
				else {
					high = mid - 1;
				}
			}
		}
			return -1;
		}
	public static void main(String[] args) {
		int arr[]= {32,345,567,2,4,7654,3};
		Arrays.sort(arr);
		System.out.println(BinarySearch(arr,arr.length,4));
		
	}

}
