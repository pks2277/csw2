package assignment_1;

public class Q02_binary_conversion {
	
	public static void binary_conversion(int n) {        
		        for (int i = 7; i >= 0; i--) {
		            int k = n >> i;
		            if ((k & 1) > 0)
		                System.out.print("1");
		            else
		                System.out.print("0");
		        }
		        
		    }
	public static void main(String[] args) {
		binary_conversion(1);

	}

}
