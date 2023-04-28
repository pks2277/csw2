package assignment_1;

public class Q05_reverse_k_times_array {

	 public static void rotate(int a[], int k) {
		    int n = a.length - 1;
		    reverse(a, 0, k - 1);
		    reverse(a, k, n);
		    reverse(a, 0, n);
		  }

		  public static void reverse(int a[], int s, int e) {
		    while (s < e) {
		      int temp = a[s];
		      a[s++] = a[e];
		      a[e--] = temp;
		    }
		  }

		  public static void main(String[] args) {
		    int a[] = {1,2,3,4,5,6 };
		    rotate(a, 2);
		    for (int i : a) {
		      System.out.print(i + " ");
		    }
		  }
}
