package assignment_1;

public class Q03_num_reverse {
	public static void main(String[] args) {
		int num=2732;
//		int num_of_digit=4;
//		double count=Math.pow(10, num_of_digit);
//		int num2=0;
//		while(num!=0) {
//			count/=10;
//			num2+=count*(num%10);
//			num=num/10;
//		}
//		System.out.println(num2);
		int reverse=0;
		while(num!=0) {
			int rem=num%10;
			reverse=(reverse*10)+rem;
			num=num/10;
		}
		System.out.println(reverse);

	}

}
