package Assignment_2;

import java.util.HashMap;
import java.util.Set;

public class B_Q_06_Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();

        map.put(001,"Prakhar");
        map.put(002,"Riya");
        map.put(006,"Biswanath");
        map.put(005,"Anil");
        map.put(007,"Kashish");
        map.put(62,"Atul");

        System.out.println(map);

        Set<Integer> keys=map.keySet();
        for(Integer key:keys) {
            System.out.println(key+" "+map.get(key));
        }
    }
}
