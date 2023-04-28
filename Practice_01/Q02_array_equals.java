package Practice_01;

import java.util.Arrays;

public class Q02_array_equals {
	public static void main(String[] args) {
		int arr1[]= {1,2,4,5,6,4,34};
		int arr2[]= {34,4,6,5,4,2,1};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(Arrays.equals(arr1,arr2));

	}

}
