package assignment_1;

public class Q08_replace_with_1 {
	 public static void arrange(int a[]) {
		    for (int i = 0; i < a.length; i++) {
		      while (a[i] != -1 && a[i] != i) {
		        swap(a, a[i], i);
		      }
		    }
		    for (int i : a) {
		      System.out.print(i + " ");
		    }
		  }
	public static void swap(int arr[],int i,int j) {
		int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

	public static void main(String[] args) {
		 int a[] = { 2, 4, -1, 0, 3, 5 };
		    arrange(a);

	}
}
