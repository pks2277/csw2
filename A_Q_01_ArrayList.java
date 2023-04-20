package Assignment_2;
import java.util.ArrayList;
import java.util.Scanner;
public class A_Q_01_ArrayList {
        public static void main(String[] args) {

            ArrayList <Integer> al=new ArrayList<>();
            al.add(1);
            al.add(2);
            al.add(3);
            al.add(4);
            al.add(5);
            al.add(6);
            System.out.println("Array List is: "+al);

            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a key you want to search: ");
            int key=sc.nextInt();
            if(al.contains(key)) {
                System.out.println(key+" is present.");
            }
            else System.out.println("Not Present.");

            System.out.print("Enter a index which you want to delete : ");
            int index=sc.nextInt();
            if(index<al.size() && index>=0) {
                al.remove(index);

            }
            else System.out.println("Invalid Index");


            System.out.println("ArrayList is Empty "+al.isEmpty());
            sc.close();

        }

    }

