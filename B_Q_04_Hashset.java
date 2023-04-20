package Assignment_2;

import java.util.HashSet;
import java.util.Iterator;

public class B_Q_04_Hashset {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Prakhar");
        set.add("Atul");
        set.add("Anil");
        set.add("Biswanath");
        System.out.println(set);
        Iterator<String> it= set.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
