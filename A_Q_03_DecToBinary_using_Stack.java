package Assignment_2;

import java.util.*;
public class A_Q_03_DecToBinary_using_Stack {

    public static void main(String[] args) {
        Stack <Integer> stack=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num>0) {
            int rem=num%2;
            stack.push(rem);
            num=num/2;
        }
        while(!(stack.isEmpty())) {
            System.out.println(stack.pop());
        }
        sc.close();
    }


}
