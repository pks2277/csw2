package Assignment_2;

import java.util.Scanner;
import java.util.Stack;

public class A_Q_04_evaluationOfPostfix_usingStack {
    public static void main(String[] args) {
        System.out.println("Enter your Postfix expression: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                stack.push(c-'0');
            }
            else{
                int val1=stack.pop();
                int val2=stack.pop();
                switch (c){
                    case '+':
                        stack.push(val2+val1);
                        break;
                    case '-':
                        stack.push(val2-val1);
                        break;
                    case '/':
                        stack.push(val2/val1);
                        break;
                    case '*':
                        stack.push(val2*val1);
                        break;
                }
            }
        }
        System.out.println(stack.pop());
    }
}
