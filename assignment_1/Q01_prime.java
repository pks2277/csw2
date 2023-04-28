package assignment_1;

public class Q01_prime {
	public static void check_prime(int num) {
		int count=0;
		for(int i=1;i<num/2;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>=1) {
			System.out.println("Its a Prime Number");
		}
		else
			System.out.println("Not a Prime number");
	}

	public static void main(String[] args) {
		int num=2;
		check_prime(num);

	}

}
