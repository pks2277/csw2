package Assignment3;

public class A3_Q_05_sortAccToGivenArray {

	public static void main(String[] args) {
		int arr1[]= { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
		int arr2[]= { 2, 1, 8, 3 };
		int arr3[]= new int[arr1.length];
		int count=0;
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr2[i]==arr1[j]) {
					arr3[count]=arr1[j];
					count++;
				}
				else if(arr1[i]!=2 && arr1[i]!=1&& arr1[i]!=8 &&arr1[i]!=3) {
					
				}
			}
		}
		for(int e:arr3) {
			System.out.print(e+" ");
		}
		
		
		
	}

}
