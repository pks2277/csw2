package Assignment_2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class B_Q_01_treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set =new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(6);

        System.out.println(set);

        System.out.print("Enter a Number you want to search: ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if (set.contains(n)){
            System.out.println(n+" is present.");
        }
        else System.out.println(n+" is not present.");

        set.remove(1);

        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
