package chap_10;
import java.util.*;
public class ChotaBhim {
	public static int method1(int arr[],int time) {
		int elixir=0;
		for(int i=0;i<60;i++) {
			Arrays.sort(arr);
			double temp=arr[4];
			elixir += temp;
			double temp2=temp/2;
			arr[4]=(int)Math.ceil(temp2);
		}
		return elixir;
	}
	
	public static int method2(int arr[],int time) {
		int elixir=0;
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		while(time>0) {
			int temp=pq.remove();
			elixir += temp;
			temp=(int)Math.ceil(temp/2.0);
			pq.add(temp);
			time-=1;
		}
		
		return elixir;
	}
	

	public static void main(String[] args) {
		int arr[]= {2,1,10,4,2};
		int time=50;
		//System.out.println(method1(arr,time));
		System.out.println(method2(arr,time));

	}

}
