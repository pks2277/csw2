package assignment_1;

public class Q06_pos_nov_largest_sum {

	 public static int contiguousSubArrSum(int a[]) {
		    int maxSum = Integer.MIN_VALUE;
		    int currSum = 0;
		    int start = 0, end = a.length - 1, tempStart = 0;
		    for (int i = 0; i < a.length; i++) {
		      currSum += a[i];
		      if (currSum >= maxSum) {
		        maxSum = currSum;
		        start = tempStart;
		        end=i;
		      }
		      if (currSum < 0) {
		        currSum = 0;
		        tempStart = i + 1;
		      }
		    }
		    for (int i = start; i <= end; i++) {
		      System.out.print(a[i] + " ");
		    }
		    System.out.println();
		    return maxSum;
		  }

		  public static void main(String[] args) {
		    int a[] = { 2, -1, -3, -5, 15, -6 };
		    System.out.println(contiguousSubArrSum(a));
		  }
}
