package Hash;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapBasics {

	public static void main(String[] args) {
		// Making map object for HashMap
		HashMap <Integer,String> map=new HashMap<>();
		
		//Insertion
		map.put(001,"Prakhar");
		map.put(002,"Riya");
		map.put(006,"Biswanath");
		map.put(005,"Anil");
		map.put(007,"Kashish");
		map.put(62,"Atul");
		
//		System.out.println(map);
//		
//		map.put(001,"Himanshu");
//		
//		System.out.println(map);
//		
//		
//		//Searching
//		System.out.println(map.containsKey(001));
//		System.out.println(map.containsKey(456));
//		
//		//getting values
//		System.out.println(map.get(001));
//		System.out.println(map.get(456));
//		
		//Iterator in HashMap
//		for(HashMap.Entry<Integer,String> e:map.entrySet()) {
//			System.out.print(e.getKey()+" ");
//			System.out.print(e.getValue());
//			System.out.println();
//		}
			
			
		//to get only keys
			Set<Integer> keys=map.keySet();
			for(Integer key:keys) {
				System.out.println(key+" "+map.get(key));
			}
				
				System.out.println(map);
		// Remove
			map.remove(62);  //map.remove(key value);
			System.out.println(map);
			
		
		
		
	

	}

}
