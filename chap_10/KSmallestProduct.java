package chap_10;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KSmallestProduct {
	public static int method1(int arr[],int k) {
		int product=1;
		Arrays.sort(arr);
		if(arr[0]==0) 
			return 0;
		else {
			for(int i=0;i<k;i++) {
				product*=arr[i];
			}
		}
		
		return product;
	}
	public static int method2(int arr[],int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		int product=1;
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		while(k>0) {
			int temp=pq.remove();
			if(temp==0) 
				return 0;
			else {
				while(k>0) {
					temp=pq.remove();
					product*=temp;
					k-=1;
				}
			}
			
		}
		return product;
	}

	public static void main(String[] args) {
		int arr[]= {5,1,0,4,10};
		int k=3;
		//System.out.println(method1(arr,k));
		System.out.println(method1(arr,k));

	}

}
