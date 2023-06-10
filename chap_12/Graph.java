package chap_12;
import java.util.*;
public class Graph {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]= {{0,1,1,0,0},
					  {1,0,1,0,0},
					  {1,1,0,1,0},
					  {0,0,1,0,1},
					  {0,0,0,1,0}};
		HashSet<Integer> hs1 = new HashSet<Integer>();
		//HashSet<Integer> hs2 = new HashSet<Integer>();
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				hs1.add(0);
				if(arr[i][j]==1) {
					if(!hs1.contains(j)) {
							hs1.add(j);
						}
						
					}
				
			}
		}
		System.out.println(hs1);
	}

}
