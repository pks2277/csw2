package chapter_5;
import java.util.*;

public class ex_10_RemoveDupilicates {		
	public static void RemoveDuplicatesUsingHashSet(int arr[]) {
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,1,2,3,45,0};
		RemoveDuplicatesUsingHashSet(arr);
		

	}

}

