package chapter_5;

public class ex_11_MissingNumberFind {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,10,11};
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		n=n+1;
		int mustSum=(n*(n+1))/2;
		System.out.println(mustSum-sum);

	}

}
